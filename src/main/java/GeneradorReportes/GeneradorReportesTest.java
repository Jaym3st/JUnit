package GeneradorReportes;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.function.Executable;
import static org.junit.jupiter.api.Assertions.*;

public class GeneradorReportesTest {
    private GeneradorReportes generadorReportes = new GeneradorReportes();
    @TestFactory
    Stream<DynamicTest> testGenerarReporte() {
        List<String> datos = Arrays.asList("Dato1", "Dato2", "Dato3");

        return Stream.of(
                dynamicTest("Genera reporte con datos", () -> {
                    String resultado = generadorReportes.generarReporte(datos);
                    assertTrue(resultado.contains("Reporte"));
                    assertTrue(resultado.contains("Dato1"));
                    assertTrue(resultado.contains("Dato2"));
                    assertTrue(resultado.contains("Dato3"));
                }),
                dynamicTest("Genera reporte vacío", () -> {
                    String resultado = generadorReportes.generarReporte(null);
                    assertEquals("Reporte vacío", resultado);
                }),
                dynamicTest("Genera reporte vacío para lista vacía", () -> {
                    String resultado = generadorReportes.generarReporte(Arrays.asList());
                    assertEquals("Reporte vacío", resultado);
                })
        );
    }
    private static DynamicTest dynamicTest(String testName, Executable executable) {
        return DynamicTest.dynamicTest(testName, executable);
    }
}
