
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        BookExchangeSystem system = new BookExchangeSystem();

        boolean running = true;

        while (running) {

            displayMenu();

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {

                case "1":
                    registerStudent(system);
                    break;

                case "2":
                    addBook(system);
                    break;

                case "3":
                    system.displayBooks();
                    break;

                case "4":
                    searchBook(system);
                    break;

                case "5":
                    borrowBook(system);
                    break;

                case "6":
                    returnBook(system);
                    break;

                case "7":
                    system.displayTransactions();
                    break;

                case "8":
                    running = false;
                    System.out.println("Thank you for using Campus Book Exchange.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void displayMenu() {

        System.out.println("\n==========================================");
        System.out.println("     CAMPUS BOOK EXCHANGE SYSTEM");
        System.out.println("==========================================");
        System.out.println("1. Register Student");
        System.out.println("2. Add Book");
        System.out.println("3. View All Books");
        System.out.println("4. Search Book");
        System.out.println("5. Borrow Book");
        System.out.println("6. Return Book");
        System.out.println("7. View Transaction History");
        System.out.println("8. Exit");
        System.out.println("==========================================");
    }

    private static void registerStudent(BookExchangeSystem system) {

        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        Student student = new Student(id, name, email);

        if (system.addStudent(student)) {
            System.out.println("Student registered successfully.");
        } else {
            System.out.println("A student with this ID already exists.");
        }
    }

    private static void addBook(BookExchangeSystem system) {

        System.out.print("Enter book ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter title: ");
        String title = scanner.nextLine();

        System.out.print("Enter author: ");
        String author = scanner.nextLine();

        System.out.print("Enter category/subject: ");
        String category = scanner.nextLine();

        System.out.print("Enter owner student ID: ");
        String ownerId = scanner.nextLine();

        Book book = new Book(
                id, title, author, category, ownerId
        );

        if (system.addBook(book)) {
            System.out.println("Book added successfully.");
        } else {
            System.out.println("A book with this ID already exists.");
        }
    }

    private static void searchBook(BookExchangeSystem system) {

        System.out.print("Enter title, author or category: ");
        String keyword = scanner.nextLine();

        system.searchBook(keyword);
    }

    private static void borrowBook(BookExchangeSystem system) {

        System.out.print("Enter book ID: ");
        String bookId = scanner.nextLine();

        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();

        system.borrowBook(bookId, studentId);
    }

    private static void returnBook(BookExchangeSystem system) {

        System.out.print("Enter book ID: ");
        String bookId = scanner.nextLine();

        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();

        system.returnBook(bookId, studentId);
    }
}