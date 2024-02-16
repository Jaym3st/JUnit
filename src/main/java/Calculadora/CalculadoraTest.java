package Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculadoraTest {
    @Test
    public void testSumar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5, calculadora.sumar(2, 3));
        assertEquals(-1, calculadora.sumar(-5, 4));
        assertEquals(0, calculadora.sumar(0, 0));
    }

    @Test
    public void testRestar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2, calculadora.restar(5, 3));
        assertEquals(-9, calculadora.restar(-5, 4));
        assertEquals(0, calculadora.restar(0, 0));
    }

    @Test
    public void testMultiplicar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(6, calculadora.multiplicar(2, 3));
        assertEquals(-20, calculadora.multiplicar(-5, 4));
        assertEquals(0, calculadora.multiplicar(0, 0));
    }

    @Test
    public void testDividir() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2.0, calculadora.dividir(6, 3), 0.001);
        assertEquals(-1.25, calculadora.dividir(-5, 4), 0.001);
        assertThrows(ArithmeticException.class, () -> {
            calculadora.dividir(8, 0);
        });
    }
}
