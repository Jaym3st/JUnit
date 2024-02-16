package Excepciones;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorTest {

    @Test
    public void testValidarTexto() {
        Validador validador = new Validador();

        // Prueba cuando el texto es válido
        assertDoesNotThrow(() -> {
            validador.validarTexto("Texto válido");
        });

        // Prueba cuando el texto es nulo
        TextoInvalidoException exception = assertThrows(TextoInvalidoException.class, () -> {
            validador.validarTexto(null);
        });
        assertEquals("El texto no puede ser nulo ni vacío", exception.getMessage());

        // Prueba cuando el texto está vacío
        exception = assertThrows(TextoInvalidoException.class, () -> {
            validador.validarTexto("");
        });
        assertEquals("El texto no puede ser nulo ni vacío", exception.getMessage());
    }
}

