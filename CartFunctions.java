import java.util.ArrayList;
import java.util.List;

class CartFunctions {
    private List<Item> cart = new ArrayList<>();

    public void addItem(Item item) {
        cart.add(item);
        System.out.println(item.getName() + " was added to the cart.");
    }

    public void removeItem(int index) {
        if (index >= 0 && index < cart.size()) {
            Item removedItem = cart.remove(index);
            System.out.println(removedItem.getName() + " was removed from the cart.");
        } else {
            System.out.println("Invalid index. Item not removed.");
        }
    }

    public void viewCart() {
        System.out.println("Shopping Cart:");
        for (int i = 0; i < cart.size(); i++) {
            System.out.println((i + 1) + ". " + cart.get(i));
        }
    }

}
