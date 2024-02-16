package Teg;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("ComponenteA")
public class SistemaConComponentesTest {
    private ComponenteA componenteA = new ComponenteA();
    @Test
    void pruebaOperacionA() {
        String resultado = componenteA.operacionA();
        assertEquals("Resultado de operación A", resultado);
    }
}