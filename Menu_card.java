import java.util.Scanner;

public class Menu_card {
    public static  void Menu(){
        Scanner in = new Scanner(System.in);
        System.out.println("# Hello Welcome to Karkev Hotel #");
        System.out.println("Select the meal from the following options(number):");
        System.out.println("Menu card \n 1.Veg Meal \n 2.Non-Veg Meal \n 3.Exit");
        int choice1 = in.nextInt();
        in.nextLine();
        switch (choice1){
            case 1:
                System.out.println("You have chosen Veg Meal");
                System.out.println("Select from the categories below:");
                System.out.println("1. Snacks \n2. Starter \n3. Dinner");
                int vegChoice = in.nextInt();
                in.nextLine();

                switch (vegChoice) {
                    case 1:
                        System.out.println("Snacks Menu:");
                        System.out.println("1. Samosa - 20 Rupees \n 2. Pav Bhaji - 60 Rupees \n 3. Paratha - 30 Rupees");
                        System.out.println("What would like to order?");
                        int choice = in.nextInt();
                        Price(choice);
                        break;
                    case 2:
                        System.out.println("Starter Menu:");
                        System.out.println("1. Onion Bhaji - 50 Rupees \n 2. Paneer Chilli - 70 Rupees");
                        System.out.println("What would you like to order");
                        choice =in.nextInt();
                        Price(choice);
                        break;
                    case 3:
                        System.out.println("Dinner Menu:");
                        System.out.println("1. Shahi Paneer - 250 Rupees \n 2. Dal Tadka - 120 Rupees \n 3. Veg Dum Biryani - 150 Rupees");
                        System.out.println("What would you like to order?");
                        choice = in.nextInt();
                        Price(choice);
                        break;
                    default:
                        System.out.println("Invalid choice in Veg Meal!");
                        break;
                }
                break;
            case 2:
                System.out.println("You have chosen Non-Veg Meal");
                System.out.println("Select from the categories below:");
                System.out.println("1. Snacks \n2. Starter \n3. Dinner");
                int nonVegChoice = in.nextInt();
                in.nextLine();
                switch (nonVegChoice) {
                    case 1:
                        System.out.println("Snacks Menu");
                        System.out.println(" 1.Chicken Bugger - 70 Rupees \n 2.Chicken Shawarma Rolls - 100 Rupees \n 3.Chicken Spring Rolls - 120 Rupees");
                        System.out.println("What would you like to order?");
                        int choice = in.nextInt();
                        Price(choice);
                        break;
                    case 2:
                        System.out.println("Starter Menu");
                        System.out.println("1. Chicken Lollipop - 50 Rupees \n 2. Chicken Chilli - 70 Rupees");
                        System.out.println("What would you like to order?");
                        choice = in.nextInt();
                        Price(choice);
                        break;
                    case 3:
                        System.out.println("Dinner Menu");
                        System.out.println("1. Butter Chicken - 120 Rupees \n 2.Grilled Chicken Steak - 200 Rupees\n 3.Chicken Korma - 180 Rupees");
                        System.out.println("What would you like to order?");
                        choice = in.nextInt();
                        Price(choice);
                        break;
                    default:
                        System.out.println("Invalid choice in Non-Veg Meal!");
                        break;
                }
                break;
            case 3:
                System.out.println("Thank you for visiting");
        }
    }
    public static int Price(int choice){
        Scanner in = new Scanner(System.in);
        int Bill =0,NewBill=0;
        System.out.println("Enter the quantity: ");
        int quantity = in.nextInt();
        System.out.println("Enter the price: ");
        int price = in.nextInt();
        Bill = quantity * price + NewBill;
        NewBill=Bill;
        Double TotBill = Bill+(0.6*Bill);
        System.out.println("Bill is: " + TotBill);
        in.close();
        return Bill;
    }
    public static void main(String[] args) {
        Menu();
    }
}