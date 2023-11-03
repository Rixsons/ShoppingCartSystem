import java.util.Scanner;

public class MainCart {
    public static void main(String[] args) {
        // Initialize a product catalog
        ProductList list = new ProductList();
        list.addItem("Heroine");
        list.addItem("Opium");
        list.addItem("Nicotine");
        list.addItem("Morphine");
        list.addItem("Marijuana");
        list.addItem("Happy Pill");


        // Initialize the shopping cart
        CartFunctions cart = new CartFunctions();

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. VIEW CART");
            System.out.println("2. ADD ITEM");
            System.out.println("3. REMOVE");
            System.out.println("4. View Product Catalog");
            System.out.println("5. Exit");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    cart.viewCart();
                    break;
                case 2:
                    list.displayItem();
                    System.out.print("Choose item (use number) to add: ");
                    int productNumber = scanner.nextInt();
                    if (productNumber >= 1 && productNumber <= list.getSize()) {
                        cart.addItem(list.getItem(productNumber - 1));
                    } else {
                        System.out.println("Invalid product number.");
                    }
                    break;
                case 3:
                    cart.viewCart();
                    System.out.print("Enter the product number to remove from the cart: ");
                    int itemNumberToRemove = scanner.nextInt();
                    cart.removeItem(itemNumberToRemove - 1);
                    break;
                case 4:
                    list.displayItem();
                    break;

                case 5:
                    System.out.println("Thanks for the patronage!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }

}
