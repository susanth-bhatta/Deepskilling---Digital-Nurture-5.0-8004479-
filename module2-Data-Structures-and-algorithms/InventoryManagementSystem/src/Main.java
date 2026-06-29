public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Product p1 = new Product(101, "Laptop", 20, 55000);
        Product p2 = new Product(102, "Keyboard", 50, 1500);
        Product p3 = new Product(103, "Mouse", 80, 700);

        // Add Products
        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);

        System.out.println("\nInventory:");

        inventory.displayProducts();

        // Update Product
        inventory.updateProduct(102, "Mechanical Keyboard", 40, 2500);

        // Delete Product
        inventory.deleteProduct(103);

        System.out.println("\nUpdated Inventory:");

        inventory.displayProducts();
    }
}