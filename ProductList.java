import java.util.ArrayList;
import java.util.List;

class ProductList {
    private List<Item> products = new ArrayList<>();

    public void addItem(String name) {
        products.add(new Item(name));
    }

    public int getSize() {
        return products.size();
    }

    public Item getItem(int index) {
        return products.get(index);
    }

    public void displayItem() {
        System.out.println("Items:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + ". " + products.get(i));
        }
    }
}

