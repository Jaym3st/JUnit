package ProcesadorTareasPesadas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProcesadorTareasPesadasTest {

    @Test
    void deberiaEjecutarseDentroDeLimiteDeTiempo() {
        long limiteTiempoMillis = 5000;

        ProcesadorTareasPesadas procesador = new ProcesadorTareasPesadas();

        long tiempoInicio = System.currentTimeMillis();

        procesador.realizarOperacionIntensiva();

        long tiempoFin = System.currentTimeMillis();

        long tiempoTotal = tiempoFin - tiempoInicio;

        assertTrue(tiempoTotal <= limiteTiempoMillis,
                String.format("La operación intensiva tardó %d milisegundos, que excede el límite de %d milisegundos",
                        tiempoTotal, limiteTiempoMillis));
    }
}
