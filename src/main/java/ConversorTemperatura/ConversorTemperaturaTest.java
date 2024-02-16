package ConversorTemperatura;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class ConversorTemperaturaTest {
    private ConversorTemperatura conversor = new ConversorTemperatura();
    @ParameterizedTest
    @ValueSource(doubles = {0, 25, -10, 100, -40})
    void testCelsiusAFahrenheit(double celsius) {
        double resultado = conversor.celsiusAFahrenheit(celsius);
        double esperado = (celsius * 9 / 5) + 32;
        assertEquals(esperado, resultado, 0.001);
    }

    @ParameterizedTest
    @ValueSource(doubles = {32, 68, -22, 212, -40})
    void testFahrenheitACelsius(double fahrenheit) {
        double resultado = conversor.fahrenheitACelsius(fahrenheit);
        double esperado = (fahrenheit - 32) * 5 / 9;
        assertEquals(esperado, resultado, 0.001);
    }
}
