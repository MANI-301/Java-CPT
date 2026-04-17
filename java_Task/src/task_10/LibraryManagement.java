package task_10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Book {
    private int bookId;
    private String title;
    private String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author;
    }
}

public class LibraryManagement {
    static ArrayList<Book> books = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== Library Management Menu =====");
            System.out.println("1. Add new book");
            System.out.println("2. Display all books");
            System.out.println("3. Search book by title");
            System.out.println("4. Remove book by ID");
            System.out.println("5. Sort books by title");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    displayBooks();
                    break;
                case 3:
                    searchBookByTitle();
                    break;
                case 4:
                    removeBookById();
                    break;
                case 5:
                    sortBooksByTitle();
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);
    }

    public static void addBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        books.add(new Book(id, title, author));
        System.out.println("Book added successfully.");
    }

    public static void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("\nList of Books:");
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public static void searchBookByTitle() {
        System.out.print("Enter title to search: ");
        String searchTitle = sc.nextLine();

        boolean found = false;
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(searchTitle)) {
                System.out.println("Book found: " + b);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }

    public static void removeBookById() {
        System.out.print("Enter Book ID to remove: ");
        int id = sc.nextInt();

        Book bookToRemove = null;
        for (Book b : books) {
            if (b.getBookId() == id) {
                bookToRemove = b;
                break;
            }
        }

        if (bookToRemove != null) {
            books.remove(bookToRemove);
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("Book ID not found.");
        }
    }

    public static void sortBooksByTitle() {
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getTitle().compareToIgnoreCase(b2.getTitle());
            }
        });

        System.out.println("Books sorted by title.");
    }
}