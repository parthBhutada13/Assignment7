package calculator;

public interface Operation {
    double calculate(double num1, double num2) throws ArithmeticException, IllegalArgumentException;
}
