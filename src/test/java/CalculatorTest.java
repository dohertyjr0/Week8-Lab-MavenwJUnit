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

    @Test
    void testMultiplication() {
        assertEquals(20, calculator.multiply(4, 5));
    }

    @Test
    void testMultiplicationOverflow() {
        assertThrows(UnsupportedOperationException.class, () -> calculator.multiply(Integer.MAX_VALUE, 2));
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator.divide(6, 3));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
    }
