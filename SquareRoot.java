package calculator;

public class SquareRoot implements Operation {
    @Override
    public double calculate(double num1, double num2) throws ArithmeticException {
        // Only num1 is used; num2 is ignored
        if (num1 < 0) {
            throw new ArithmeticException("Cannot take square root of negative number.");
        }
        return Math.sqrt(num1);
    }
}
