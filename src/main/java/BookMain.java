import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Do Androids Dream of Electric Sheep?", 258, 1968));
        books.add(new Book("The Code Breaker", 560, 2021));
        books.add(new Book("The Hollow Chocolate Bunnies of the Apocalypse", 342, 2002));



        while (true) {
            System.out.print("Title of the book: ");
            String bookTitle = scanner.nextLine();

            if (bookTitle.trim().isEmpty()) {
                break;
            }

            System.out.print("How many pages? ");
            int bookPages = scanner.nextInt();
            scanner.nextLine();

            System.out.print("What year was it published? ");
            int bookYear = scanner.nextInt();
            scanner.nextLine();

            books.add(new Book(bookTitle, bookPages, bookYear));
        }

        System.out.println("What information would you like to see?");
        String userInput = scanner.nextLine();

        if (userInput.equals("everything")) {
            for (Book book : books) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("Pages: " + book.getPages());
                System.out.println("Publication Year: " + book.getYear());
                System.out.println();
            }
        } else if (userInput.equals("name")) {
            for (Book book : books) {
                System.out.println("Title: " + book.getTitle());
            }
        } else {
            System.out.println("Invalid input.");
        }
    }
}
