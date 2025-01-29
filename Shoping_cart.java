import java.util.ArrayList;
import java.util.Scanner;

public class Shoping_cart {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> cart = new ArrayList<>(); // To store the shopping cart items

        System.out.println("Welcome to the Shopping Cart program!");

        while (true) {
            System.out.print("How many items do you want to add to the cart? ");
            int itemCount = in.nextInt();
            in.nextLine(); // Consume the newline character left by nextInt()

            for (int i = 0; i < itemCount; i++) {
                System.out.print("Enter item " + (i + 1) + ": ");
                String item = in.nextLine();
                cart.add(item); // Add entered item to the cart
            }

            System.out.println("Items have been added to the cart!");

            System.out.print("Do you want to add more items? (yes/no): ");
            String choice = in.nextLine().trim().toLowerCase();
            if (!choice.equals("yes")) {
                break;
            }
        }

        System.out.println("\nYour Shopping Cart contains:");
        for (int i = 0; i < cart.size(); i++) {
            System.out.println((i + 1) + ". " + cart.get(i));
        }

        System.out.println("Thank you for using the Shopping Cart program!");
        in.close(); // Close the scanner
    }
}