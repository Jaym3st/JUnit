package TareasEstructuradas;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class GestorDeTareasTest {

    private GestorDeTareas gestor;

    @BeforeEach
    void setUp() {
        gestor = new GestorDeTareas();
    }

    @Nested
    class AgregarTarea {

        @Test
        void deberiaAgregarTareaCorrectamente() {
            gestor.agregarTarea("1", "Hacer la compra");
            assertEquals("Hacer la compra", gestor.buscarTareaPorId("1").orElse(null));
        }

        @Test
        void deberiaNoPermitirAgregarTareaConMismoId() {
            gestor.agregarTarea("1", "Hacer la compra");
            assertThrows(IllegalArgumentException.class, () -> gestor.agregarTarea("1", "Ir al gimnasio"));
        }
    }

    @Nested
    class EliminarTarea {

        @Test
        void deberiaEliminarTareaExistente() {
            gestor.agregarTarea("1", "Hacer la compra");
            assertTrue(gestor.eliminarTarea("1"));
            assertFalse(gestor.buscarTareaPorId("1").isPresent());
        }

        @Test
        void deberiaNoEliminarTareaInexistente() {
            assertFalse(gestor.eliminarTarea("1"));
        }
    }

    @Nested
    class BuscarTareaPorId {

        @Test
        void deberiaEncontrarTareaExistente() {
            gestor.agregarTarea("1", "Hacer la compra");
            Optional<String> descripcion = gestor.buscarTareaPorId("1");
            assertTrue(descripcion.isPresent());
            assertEquals("Hacer la compra", descripcion.get());
        }

        @Test
        void deberiaNoPermitirAgregarTareaConMismoId() {
            gestor.agregarTarea("1", "Hacer la compra");
            assertThrows(IllegalArgumentException.class, () -> gestor.agregarTarea("1", "Ir al gimnasio"));
        }
    }
}
