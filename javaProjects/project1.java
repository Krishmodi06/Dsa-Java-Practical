import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String title;
    String author;
    boolean isIssued;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }
}

public class project1 {
    ArrayList<Book> books = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // Add new book with title & author
    void addBook() {
        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();
        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();
        books.add(new Book(title, author));
        System.out.println("Book added successfully!");
    }

    // Issue book by title
    void issueBook() {
        System.out.print("Enter Book Title to Issue: ");
        String title = sc.nextLine();
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title) && !b.isIssued) {
                b.isIssued = true;
                System.out.println("Book issued successfully!");
                return;
            }
        }
        System.out.println("Book not available or already issued!");
    }

    // Return book by title
    void returnBook() {
        System.out.print("Enter Book Title to Return: ");
        String title = sc.nextLine();
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title) && b.isIssued) {
                b.isIssued = false;
                System.out.println("Book returned successfully!");
                return;
            }
        }
        System.out.println("Invalid title or book was not issued!");
    }

    // Display all available books
    void displayBooks() {
        System.out.println("\nAvailable Books:");
        boolean found = false;
        for (Book b : books) {
            if (!b.isIssued) {
                System.out.println("Title: " + b.title + " | Author: " + b.author);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books available!");
        }
    }

    public static void main(String[] args) {
        project1 library = new project1();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Library Book System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Display Available Books");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: library.addBook(); break;
                case 2: library.issueBook(); break;
                case 3: library.returnBook(); break;
                case 4: library.displayBooks(); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}
