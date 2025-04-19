// Name: Parth Bhutada
// PRN: 23070126084
// Batch: AIML B1

package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;

        // Menu loop continues until user chooses to exit
        while (repeat) {
            try {
                // Display calculator menu
                System.out.println("\n--- Calculator Menu ---");
                System.out.println("1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.println("5. Square");
                System.out.println("6. Cube");
                System.out.println("7. Square Root");
                System.out.println("8. Exit");

                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                double num1, num2;
                Operation op;

                // Decision structure to perform selected operation
                switch (choice) {
                    case 1:
                        op = new Add();
                        System.out.print("Enter two numbers: ");
                        num1 = scanner.nextDouble();
                        num2 = scanner.nextDouble();
                        System.out.println("Result: " + op.calculate(num1, num2));
                        break;

                    case 2:
                        op = new Subtract();
                        System.out.print("Enter two numbers: ");
                        num1 = scanner.nextDouble();
                        num2 = scanner.nextDouble();
                        System.out.println("Result: " + op.calculate(num1, num2));
                        break;

                    case 3:
                        op = new Multiply();
                        System.out.print("Enter two numbers: ");
                        num1 = scanner.nextDouble();
                        num2 = scanner.nextDouble();
                        System.out.println("Result: " + op.calculate(num1, num2));
                        break;

                    case 4:
                        op = new Division();
                        System.out.print("Enter two numbers: ");
                        num1 = scanner.nextDouble();
                        num2 = scanner.nextDouble();
                        System.out.println("Result: " + op.calculate(num1, num2));
                        break;

                    case 5:
                        op = new Square();
                        System.out.print("Enter a number: ");
                        num1 = scanner.nextDouble();
                        System.out.println("Result: " + op.calculate(num1, 0)); // num2 is ignored for square
                        break;

                    case 6:
                        op = new Cube();
                        System.out.print("Enter a number: ");
                        num1 = scanner.nextDouble();
                        System.out.println("Result: " + op.calculate(num1, 0)); // num2 is ignored for cube
                        break;

                    case 7:
                        op = new SquareRoot();
                        System.out.print("Enter a number: ");
                        num1 = scanner.nextDouble();
                        System.out.println("Result: " + op.calculate(num1, 0)); // num2 is ignored for square root
                        break;

                    case 8:
                        repeat = false;
                        System.out.println("Thank you for using the Calculator!");
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (ArithmeticException ae) {
                System.out.println("Math Error: " + ae.getMessage());
            } catch (Exception e) {
                System.out.println("Input Error: " + e.getMessage());
                scanner.nextLine(); // clear buffer
            }
        }

        scanner.close();
    }
}
