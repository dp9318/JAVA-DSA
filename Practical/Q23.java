import java.util.*;

class Inventory<T> {
    private List<T> items = new ArrayList<>();

    void addItem(T item) {
        items.add(item);
    }

    void removeItem(T item) {
        items.remove(item);
    }

    void displayItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }

    static <E> void inspectItem(E item) {
        System.out.println("Inspecting Item: " + item);
    }
}

class ProductItem {
    int id;
    String name;
    double price;

    ProductItem(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "Product [ID=" + id + ", Name=" + name + ", Price=" + price + "]";
    }
}

class Q23 {
    public static void main(String[] args) {
        Inventory<ProductItem> productInventory = new Inventory<>();
        productInventory.addItem(new ProductItem(1, "Laptop", 75000));
        productInventory.addItem(new ProductItem(2, "Smartphone", 35000));
        System.out.println("Product Inventory:");
        productInventory.displayItems();

        System.out.println();

        Inventory<String> rawMaterialInventory = new Inventory<>();
        rawMaterialInventory.addItem("Steel Sheets");
        rawMaterialInventory.addItem("Copper Wires");
        System.out.println("Raw Material Inventory:");
        rawMaterialInventory.displayItems();

        System.out.println();
        Inventory.inspectItem("Fiber Optic Cable");
        Inventory.inspectItem(new ProductItem(3, "Keyboard", 1500));
    }
}

