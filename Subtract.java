package calculator;

public class Subtract implements Operation {
  @Override
    public double calculate(double num1, double num2) {
        return num1 - num2;
    }
}
