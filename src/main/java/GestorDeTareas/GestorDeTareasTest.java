package GestorDeTareas;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GestorDeTareasTest {

    private GestorDeTareas gestor;

    @BeforeEach
    public void setUp() {
        gestor = new GestorDeTareas();
        gestor.agregarTarea("Tarea 1");
        gestor.agregarTarea("Tarea 2");
        gestor.agregarTarea("Tarea 3");
    }

    @Test
    public void testAgregarTarea() {
        assertTrue(gestor.obtenerTareas().contains("Tarea 1"));
        assertTrue(gestor.obtenerTareas().contains("Tarea 2"));
        assertTrue(gestor.obtenerTareas().contains("Tarea 3"));

        gestor.agregarTarea("Nueva Tarea");

        assertTrue(gestor.obtenerTareas().contains("Nueva Tarea"));
    }

    @Test
    public void testEliminarTarea() {
        assertTrue(gestor.eliminarTarea("Tarea 1"));
        assertFalse(gestor.obtenerTareas().contains("Tarea 1"));
    }

    @AfterEach
    public void tearDown() {
        gestor.limpiarTareas();
    }
}
