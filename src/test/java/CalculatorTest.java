import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(5, calculator.add(2, 3));
}

    @Test
    void testSubtraction() {
        assertEquals(3, calculator.subtract(5, 2));
    }

    @Test
    void testSubtractionThrowsOnNegative() {
        assertThrows(IllegalStateException.class, () -> calculator.subtract(2, 5));
    }
