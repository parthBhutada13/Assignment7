package calculator;

public class Cube implements Operation{
    @Override
    public double calculate(double num1, double num2) throws ArithmeticException, IllegalArgumentException {
        return num1 * num1 * num1;
    }
}
