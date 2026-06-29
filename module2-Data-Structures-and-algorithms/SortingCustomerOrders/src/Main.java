public class Main {

    public static void main(String[] args) {

        Order[] orders = {

                new Order(101, "Sush", 4500),
                new Order(102, "Srividhya", 12000),
                new Order(103, "Prem", 2500),
                new Order(104, "Renuka", 8000),
                new Order(105, "Hashmitha", 6000)

        };

        System.out.println("Original Orders:");

        SortOrders.display(orders);

        // Bubble Sort
        SortOrders.bubbleSort(orders);

        System.out.println("\nOrders Sorted using Bubble Sort:");

        SortOrders.display(orders);

        // New array for Quick Sort
        Order[] orders2 = {

                new Order(101, "Sush", 4500),
                new Order(102, "Srividhya", 12000),
                new Order(103, "Prem", 2500),
                new Order(104, "Renuka", 8000),
                new Order(105, "Hashmitha", 6000)

        };

        SortOrders.quickSort(orders2, 0, orders2.length - 1);

        System.out.println("\nOrders Sorted using Quick Sort:");

        SortOrders.display(orders2);
    }
}