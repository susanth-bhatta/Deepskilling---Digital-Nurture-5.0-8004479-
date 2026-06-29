public class Main {

    public static void main(String[] args) {

        // Sorted by title
        Book[] books = {

                new Book(101, "Algorithms", "Thomas Cormen"),
                new Book(102, "Computer Networks", "Andrew Tanenbaum"),
                new Book(103, "Data Structures", "Mark Allen Weiss"),
                new Book(104, "Java Programming", "Herbert Schildt"),
                new Book(105, "Operating Systems", "Galvin")

        };

        String searchTitle = "Java Programming";

        // Linear Search
        Book result1 = LibrarySearch.linearSearch(books, searchTitle);

        System.out.println("Linear Search:");

        if (result1 != null)
            System.out.println(result1);
        else
            System.out.println("Book Not Found.");

        // Binary Search
        Book result2 = LibrarySearch.binarySearch(books, searchTitle);

        System.out.println("\nBinary Search:");

        if (result2 != null)
            System.out.println(result2);
        else
            System.out.println("Book Not Found.");
    }
}