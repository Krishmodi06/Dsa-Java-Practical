import java.util.ArrayList;
import java.util.Scanner;

class Item {
    String name;
    double price;
    int quantity;

    Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }
}

public class project4 {
    ArrayList<Item> cart = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addItem() {
        System.out.print("Enter item name: ");
        String name = sc.nextLine();
        System.out.print("Enter item price: ");
        double price = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        sc.nextLine(); // consume newline
        cart.add(new Item(name, price, quantity));
        System.out.println("Item added to cart successfully!\n");
    }

    public void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty!\n");
            return;
        }
        double total = 0;
        System.out.println("\n--- Your Cart ---");
        for (int i = 0; i < cart.size(); i++) {
            Item item = cart.get(i);
            System.out.println((i + 1) + ". " + item.name + " - ₹" + item.price + " x " + item.quantity + " = ₹" + item.getTotalPrice());
            total += item.getTotalPrice();
        }
        System.out.println("Total: ₹" + total + "\n");
    }

    public void removeItem() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty!\n");
            return;
        }
        viewCart();
        System.out.print("Enter item number to remove: ");
        int index = sc.nextInt();
        sc.nextLine();
        if (index > 0 && index <= cart.size()) {
            cart.remove(index - 1);
            System.out.println("Item removed successfully!\n");
        } else {
            System.out.println("Invalid item number!\n");
        }
    }

    public void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty! Cannot checkout.\n");
            return;
        }
        viewCart();
        System.out.println("Checkout complete. Thank you for shopping!\n");
        cart.clear();
    }

    public static void main(String[] args) {
        project4 shop = new project4();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add Item to Cart");
            System.out.println("2. View Cart");
            System.out.println("3. Remove Item");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> shop.addItem();
                case 2 -> shop.viewCart();
                case 3 -> shop.removeItem();
                case 4 -> shop.checkout();
                case 5 -> System.out.println("Exiting... Thank you!");
                default -> System.out.println("Invalid choice! Try again.\n");
            }
        } while (choice != 5);
    }
}
