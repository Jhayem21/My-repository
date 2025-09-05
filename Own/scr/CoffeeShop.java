import java.util.Scanner;

public class CoffeeShop {

    // Define coffee menu and prices ff
    //khjghg
    static String[] coffeeMenu = {"Espresso", "Cappuccino", "Latte", "Americano"};
    static double[] coffeePrices = {80.0, 100.0, 110.0, 90.0};
    static double totalSales = 0.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== Welcome to Baligya Coffee Shop ===");

        while (running) {
            System.out.println("\nMenu:");
            for (int i = 0; i < coffeeMenu.length; i++) {
                System.out.printf("%d. %s - ₱%.2f%n", (i + 1), coffeeMenu[i], coffeePrices[i]);
            }
            System.out.println("5. View Total Sales");
            System.out.println("6. Exit");

            System.out.print("Choose an option (1-6): ");
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter quantity: ");
                int qty = scanner.nextInt();
                serveCoffee(choice - 1, qty);
            } else if (choice == 5) {
                System.out.printf("Total Sales Today: ₱%.2f%n", totalSales);
            } else if (choice == 6) {
                System.out.println("Salamat sa pagbaligya! Goodbye!");
                running = false;
            } else {
                System.out.println("Invalid choice. Please try again.");
                
            }
        }

        scanner.close();
    }

    static void serveCoffee(int index, int quantity) {
        double cost = coffeePrices[index] * quantity;
        totalSales += cost;
        System.out.printf("Serving %d x %s - Total: ₱%.2f%n", quantity, coffeeMenu[index], cost);
    }
}
