import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how many books you wanted to sort:");
        int numberOfBooks = scanner.nextInt();
        scanner.nextLine();

        Set<Book> booksByTitle = new TreeSet<>();

        for (int i=0; i < numberOfBooks; i++){
            System.out.println("Enter the title of book " + (i + 1) + ": ");
            String title = scanner.nextLine();

            System.out.println("Enter the number of pages of book " + (i + 1) + ": ");
            int numberOfPages = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter the author of book " + (i + 1) + ": ");
            String author = scanner.nextLine();

            System.out.println("Enter the publication date of book " + (i + 1) + "(YYYY-MM-DD): ");
            String publicationDate = scanner.nextLine();

            Book book = new Book(title, numberOfPages, author, publicationDate);
            booksByTitle.add(book);
        }

        System.out.println("Books sorted by title: ");
        for (Book book : booksByTitle){
            System.out.println(book);
        }

        Set<Book> booksByNumberOfPages = new TreeSet<>(Comparator.comparingInt(Book::getNumberOfPages).reversed());
        booksByNumberOfPages.addAll(booksByTitle);

        System.out.println("\nBooks sorted by number of pages:");
        for (Book book : booksByNumberOfPages){
            System.out.println(book);
        }

        scanner.close();

    }
}