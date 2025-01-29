import java.util.Scanner;

public class Advcal {
    private static void Application() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number num1: ");
        double num1 = in.nextDouble();
        in.nextLine();
        double result = 0;

        while (true) {
            System.out.println("Enter the operation (symbol):\n1. +\n2. -\n3. *\n4. /\n5. exit");
            String operation = in.nextLine();

            if ("exit".equalsIgnoreCase(operation)) {
                System.out.println("Final Result is: " + num1);
                break;
            }

            switch (operation) {
                case "+":
                    System.out.println("Enter the number for addition: ");
                    double num2 = in.nextDouble();
                    result = num1 + num2;
                    System.out.println("After addition, result is: " + result);
                    num1 = result;
                    in.nextLine();
                    break;

                case "-":
                    System.out.println("Enter the number for subtraction: ");
                    num2 = in.nextDouble();
                    result = num1 - num2;
                    System.out.println("After subtraction, result is: " + result);
                    num1 = result;
                    in.nextLine();
                    break;

                case "*":
                    System.out.println("Enter the number for multiplication: ");
                    num2 = in.nextDouble();
                    result = num1 * num2;
                    System.out.println("After multiplication, result is: " + result);
                    num1 = result;
                    in.nextLine();
                    break;

                case "/":
                    System.out.println("Enter the number for division: ");
                    num2 = in.nextDouble();
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed!");
                    } else {
                        result = num1 / num2;
                        System.out.println("After division, result is: " + result);
                        num1 = result;
                    }
                    in.nextLine();
                    break;

                default:
                    System.out.println("Enter a valid operation (e.g., +, -, *, /, exit).");
                    break;
            }
        }

        in.close();
    }

    public static void main(String[] args) {
        System.out.println("| Hello, Welcome to the Calculator |");
        Application();
        System.out.println("| Thank You |");
    }
}
