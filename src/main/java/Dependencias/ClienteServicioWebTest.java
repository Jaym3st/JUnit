package Dependencias;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class ClienteServicioWebTest {
    @Test
    void deberiaObtenerInformacionUsuarioExitosamente() {
        // Configuración del mock
        ServicioWeb servicioWebMock = mock(ServicioWeb.class);
        when(servicioWebMock.obtenerDatosUsuario("userId")).thenReturn("Informacion del usuario");

        // Instanciación de la clase bajo prueba con el mock
        ClienteServicioWeb clienteServicioWeb = new ClienteServicioWeb(servicioWebMock);

        // Ejecución de la prueba
        String resultado = clienteServicioWeb.obtenerInformacionUsuario("userId");

        // Verificación de que el método del servicio web fue llamado
        verify(servicioWebMock, times(1)).obtenerDatosUsuario("userId");

        // Verificación del resultado
        assertEquals("Informacion del usuario", resultado);
    }

    @Test
    void deberiaManejarErrorDelServicioWeb() {
        // Configuración del mock para simular un error en el servicio web
        ServicioWeb servicioWebMock = mock(ServicioWeb.class);
        when(servicioWebMock.obtenerDatosUsuario("userId")).thenThrow(new RuntimeException("Error en el servicio web"));

        // Instanciación de la clase bajo prueba con el mock
        ClienteServicioWeb clienteServicioWeb = new ClienteServicioWeb(servicioWebMock);

        // Ejecución de la prueba
        String resultado = clienteServicioWeb.obtenerInformacionUsuario("userId");

        // Verificación de que el método del servicio web fue llamado
        verify(servicioWebMock, times(1)).obtenerDatosUsuario("userId");

        // Verificación de que el resultado es una cadena de error
        assertTrue(resultado.startsWith("Error:"));
    }
}

