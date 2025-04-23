public class Calculator {
    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int a, int b) {
        if (a - b < 0) {
            throw new IllegalStateException("Negative results are not allowed.");
        }
        return a - b;
    }
}
