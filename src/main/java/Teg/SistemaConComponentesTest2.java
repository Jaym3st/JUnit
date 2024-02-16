package Teg;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("ComponenteB")
public class SistemaConComponentesTest2 {
    private ComponenteB componenteB = new ComponenteB();
    @Test
    void pruebaOperacionB() {
        int resultado = componenteB.operacionB();
        assertEquals(42, resultado);
    }
}
