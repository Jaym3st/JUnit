package CajaBlanca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ControladorAccesoTest {
    private ControladorAcceso controlador = new ControladorAcceso();
    @Test
    void adminDeberiaTenerAccesoATodasLasFuncionalidades() {
        controlador.asignarRolAUsuario("adminUser", "ADMIN");
        assertTrue(controlador.verificarAcceso("adminUser", "CUALQUIER_FUNCIONALIDAD"));
    }

    @Test
    void editorDeberiaTenerAccesoExceptoGestionUsuarios() {
        controlador.asignarRolAUsuario("editorUser", "EDITOR");
        assertTrue(controlador.verificarAcceso("editorUser", "OTRA_FUNCIONALIDAD"));
        assertFalse(controlador.verificarAcceso("editorUser", "GESTION_USUARIOS"));
    }

    @Test
    void visitanteDeberiaTenerAccesoSoloAConsulta() {
        controlador.asignarRolAUsuario("visitanteUser", "VISITANTE");
        assertTrue(controlador.verificarAcceso("visitanteUser", "CONSULTA"));
        assertFalse(controlador.verificarAcceso("visitanteUser", "OTRA_FUNCIONALIDAD"));
    }

    @Test
    void usuarioSinRolDeberiaNoTenerAcceso() {
        assertFalse(controlador.verificarAcceso("sinRolUser", "CUALQUIER_FUNCIONALIDAD"));
    }

    @Test
    void usuarioConRolDesconocidoNoDeberiaTenerAcceso() {
        controlador.asignarRolAUsuario("unknownUser", "ROL_DESCONOCIDO");
        assertFalse(controlador.verificarAcceso("unknownUser", "CUALQUIER_FUNCIONALIDAD"));
    }
}

