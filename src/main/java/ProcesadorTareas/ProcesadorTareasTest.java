package ProcesadorTareas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;

public class ProcesadorTareasTest {
    private ProcesadorTareas procesadorTareas = new ProcesadorTareas();
    @Test
    public void testEjecutarTareaLarga() throws InterruptedException {
        assertTimeout(Duration.ofMillis(1000), () -> {
            procesadorTareas.ejecutarTareaLarga(500); // Simula una tarea que debería completarse en 500 milisegundos
        });
    }
}
