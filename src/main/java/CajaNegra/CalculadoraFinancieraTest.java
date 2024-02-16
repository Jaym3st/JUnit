package CajaNegra;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraFinancieraTest {
    private CalculadoraFinanciera calculadora = new CalculadoraFinanciera();
    @Test
    void deberiaCalcularInteresCompuestoCorrectamente() {
        assertEquals(1276.2815625, calculadora.calcularInteresCompuesto(1000, 0.05, 12, 5), 0.0001);
        assertEquals(2000, calculadora.calcularInteresCompuesto(2000, 0, 4, 3));
        assertEquals(1831.488, calculadora.calcularInteresCompuesto(1500, 0.08, 1, 6), 0.001);
    }

    @Test
    void deberiaCalcularVPNCorrectamente() {
        assertEquals(3241.63, calculadora.calcularVPN(0.1, new double[]{-5000, 1000, 2000, 2500, 3000}), 0.01);
        assertEquals(4050, calculadora.calcularVPN(0, new double[]{-2000, 500, 1000, 1500}));
        assertEquals(-3770.03, calculadora.calcularVPN(0.05, new double[]{-2000, -1500, -1000, -500}), 0.01);
    }
}
