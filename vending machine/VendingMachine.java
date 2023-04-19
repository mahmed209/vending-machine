import java.util.Scanner;

public class VendingMachine {
    private static final String[] ITEM_NAMES = {"Coke", "Pepsi", "Chips", "Chocolate"};
    private static final double[] ITEM_PRICES = {1.0, 1.5, 0.75, 1.25};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the vending machine!");
        displayItems();

        // Take user input for item selection and payment amount
        System.out.print("Enter the item number: ");
        int itemNumber = input.nextInt();
        System.out.print("Enter the payment amount: ");
        double payment = input.nextDouble();

        // Check if payment is sufficient
        if (payment < ITEM_PRICES[itemNumber-1]) {
            System.out.println("Payment is insufficient. Please insert more coins.");
        } else {
            // Dispense item and return change
            double change = payment - ITEM_PRICES[itemNumber-1];
            System.out.printf("Dispensing %s. Your change is $%.2f. Enjoy!\n", ITEM_NAMES[itemNumber-1], change);
        }
    }

    private static void displayItems() {
        System.out.println("Available items:");
        for (int i = 0; i < ITEM_NAMES.length; i++) {
            System.out.printf("%d. %s ($%.2f)\n", i+1, ITEM_NAMES[i], ITEM_PRICES[i]);
        }
    }
}
