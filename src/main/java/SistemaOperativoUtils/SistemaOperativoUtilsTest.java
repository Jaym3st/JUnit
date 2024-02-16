package SistemaOperativoUtils;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SistemaOperativoUtilsTest {

    @Test
    void testAlgoEnWindows() {
        Assumptions.assumeTrue(SistemaOperativoUtils.esWindows());
        assertTrue(true);
    }

    @Test
    void testOtraCosaEnLinux() {
        Assumptions.assumeTrue(SistemaOperativoUtils.esLinux());
        assertTrue(true);
    }
    @Test
    void testAlgoEnMac() {
        Assumptions.assumeTrue(SistemaOperativoUtils.esMac());
        assertTrue(true);
    }
}
