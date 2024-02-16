package GestorDeConexion;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GestorDeConexionTest {

    @BeforeAll
    public static void setUpBeforeAll() {
        GestorDeConexion.abrirConexion();
    }

    @AfterAll
    public static void tearDownAfterAll() {
        GestorDeConexion.cerrarConexion();
    }

    @Test
    public void testAlgunaOperacionEnLaBaseDeDatos() {
        assertTrue(true);
    }

    @Test
    public void testOtraOperacionEnLaBaseDeDatos() {
        assertTrue(true);
    }
}
