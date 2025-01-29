import java.util.Scanner;

public class Bank_system {

    private static double balance = 0;
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int intput = 0;
        do {
            System.out.println("Select the operation");
            System.out.println("1.Deposit  money \n" +
                    "2.Withdraw money \n" +
                    "3.Check Balance\n" +
                    "4.Exit");
            intput = in.nextInt();
            System.out.println();
            System.out.println();
            switch (intput) {
                case 1:
                    Deposit(in);
                    break;
                case 2:
                    Withdraw(in);
                    break;
                case 3:
                    Check_Balance(in);
                    break;
                default:
                    System.out.println("Enter the valid input.Try again");
                    break;
            }
        }while (intput!=4);
    }
    static void Withdraw (Scanner in){
        System.out.println("Enter the amount for withdraw:");
        double amount = in.nextDouble();
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw amount is: " + amount);
            System.out.println("Remaining balance is: " + balance);
            System.out.println();
            System.out.println();
        } else {
            System.out.println("Your balance insufficient");
            System.out.println("You have entered invalid amount for withdraw.Try again");
            System.out.println("Check the balance first.");
            System.out.println("!Thank you!");
            System.out.println();
            System.out.println();
        }
    }
    static void Check_Balance (Scanner in){
        System.out.println("The amount in your account is: " + balance);
        System.out.println("!Thank you!");
        System.out.println();
        System.out.println();
    }
    static void Deposit (Scanner in) {
        System.out.println("Enter the amount for deposit");
        int amount = in.nextInt();
        balance += amount;
        System.out.println("Deposited anount is: " + amount);
        System.out.println("New balance in account is: " + balance);
        System.out.println("!Thank you");
        System.out.println();
        System.out.println();
    }
}
