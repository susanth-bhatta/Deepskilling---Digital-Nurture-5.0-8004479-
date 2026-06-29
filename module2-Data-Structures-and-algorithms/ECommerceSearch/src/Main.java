public class Main {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Electronics"),
                new Product(103, "Keyboard", "Electronics"),
                new Product(104, "Shoes", "Fashion"),
                new Product(105, "Watch", "Accessories")

        };

        int searchId = 104;

        Product result1 = SearchOperations.linearSearch(products, searchId);

        System.out.println("Linear Search:");

        if (result1 != null)
            System.out.println(result1);
        else
            System.out.println("Product Not Found");

        Product result2 = SearchOperations.binarySearch(products, searchId);

        System.out.println("\nBinary Search:");

        if (result2 != null)
            System.out.println(result2);
        else
            System.out.println("Product Not Found");
    }
}