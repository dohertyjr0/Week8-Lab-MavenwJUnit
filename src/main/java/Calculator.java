public class Calculator {
    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        if (x - y < 0) {
            throw new IllegalStateException("Negative results are not allowed.");
        }
        return x - y;
    }

    public int multiply(int x, int y) {
        long result = (long) x * y;
        if (result > Integer.MAX_VALUE) {
            throw new UnsupportedOperationException("Multiplication overflow.");
        }
        return x * y;
    }

    public int divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return x / y;
    }
}
