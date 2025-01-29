import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Wel-come");
            System.out.println("Number1: ");
            int num1 = in.nextInt();
            System.out.println("Number2: ");
            int num2 = in.nextInt();
            calcy(num1, num2);
        in.close();
        System.out.println("Thank you");
    }

    private static void calcy(int num1, int num2) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the operation(symbol):\n1.+\n2.-\n3.*\n4.*\n5./");
        String operation = in.nextLine();
        switch (operation){
            case "+":
                System.out.println("Sum of num1:" + num1 + " and num2:" + num2 + " is: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Subtraction of num1: " + num1 + " and num2: " + num2 + " is: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Multiplication of num1: " + num1 + " and num2: " + num2 + " is: " + (num1 * num2));
                break;
            case "/":
                System.out.println("Division of num1: " + num1 + " and num2: " + num2 + " is:" + (num1 / num2));
                break;
            default:
                System.out.println("Enter valid operation");
        }
        in.close();
    }
}
