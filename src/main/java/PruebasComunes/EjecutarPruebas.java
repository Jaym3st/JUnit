package PruebasComunes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class EjecutarPruebas {
    @Test
    void ejecutarPruebaServicioA() {
        new PruebaServicioA().pruebaEjecucionBasica();
    }
    @Test
    void ejecutarPruebaServicioB() {
        new PruebaServicioB().pruebaEjecucionBasica();
    }
}

