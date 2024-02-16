package CalculadoraAvanzada;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraAvanzadaTest {

    private CalculadoraAvanzada calculadoraAvanzada = new CalculadoraAvanzada();

    @Test
    void testRaizCuadrada() {
        double resultado = calculadoraAvanzada.raizCuadrada(25);
        assertEquals(5, resultado, 0.001);
    }

    @Test
    void testLogaritmoNatural() {
        double resultado = calculadoraAvanzada.logaritmoNatural(10);
        assertEquals(2.302, resultado, 0.001);
    }

    @Disabled("La implementación del factorial está pendiente.")
    @Test
    void testFactorial() {
        assertThrows(IllegalArgumentException.class, () -> calculadoraAvanzada.factorial(-1));
        assertEquals(1, calculadoraAvanzada.factorial(0));
        assertEquals(120, calculadoraAvanzada.factorial(5));
    }
}
