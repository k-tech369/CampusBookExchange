import java.util.ArrayList;
import java.util.List;

public class BookExchangeSystem {

    private List<Student> students;
    private List<Book> books;
    private List<Transaction> transactions;

    public BookExchangeSystem() {
        students = new ArrayList<>();
        books = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    public boolean addStudent(Student student) {

        for (Student existing : students) {
            if (existing.getStudentId().equalsIgnoreCase(
                    student.getStudentId())) {
                return false;
            }
        }

        students.add(student);
        return true;
    }

    public boolean addBook(Book book) {

        for (Book existing : books) {
            if (existing.getBookId().equalsIgnoreCase(
                    book.getBookId())) {
                return false;
            }
        }

        books.add(book);
        return true;
    }

    public void displayBooks() {

        if (books.isEmpty()) {
            System.out.println("No books have been added yet.");
            return;
        }

        System.out.println("\n----- BOOK LIST -----");

        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void searchBook(String keyword) {

        boolean found = false;

        for (Book book : books) {

            if (book.getTitle().toLowerCase()
                    .contains(keyword.toLowerCase())
                    || book.getAuthor().toLowerCase()
                    .contains(keyword.toLowerCase())
                    || book.getCategory().toLowerCase()
                    .contains(keyword.toLowerCase())) {

                System.out.println(book);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching book found.");
        }
    }

    public boolean borrowBook(String bookId, String studentId) {

        Book selectedBook = null;

        for (Book book : books) {
            if (book.getBookId().equalsIgnoreCase(bookId)) {
                selectedBook = book;
                break;
            }
        }

        if (selectedBook == null) {
            System.out.println("Book not found.");
            return false;
        }

        if (!selectedBook.isAvailable()) {
            System.out.println("This book is already borrowed.");
            return false;
        }

        selectedBook.setAvailable(false);

        String id = "T" + (transactions.size() + 1);

        transactions.add(
                new Transaction(id, bookId, studentId, "BORROW")
        );

        System.out.println("Book borrowed successfully.");
        return true;
    }

    public boolean returnBook(String bookId, String studentId) {

        Book selectedBook = null;

        for (Book book : books) {
            if (book.getBookId().equalsIgnoreCase(bookId)) {
                selectedBook = book;
                break;
            }
        }

        if (selectedBook == null) {
            System.out.println("Book not found.");
            return false;
        }

        if (selectedBook.isAvailable()) {
            System.out.println("This book is not currently borrowed.");
            return false;
        }

        selectedBook.setAvailable(true);

        String id = "T" + (transactions.size() + 1);

        transactions.add(
                new Transaction(id, bookId, studentId, "RETURN")
        );

        System.out.println("Book returned successfully.");
        return true;
    }

    public void displayTransactions() {

        if (transactions.isEmpty()) {
            System.out.println("No transactions recorded.");
            return;
        }

        System.out.println("\n----- TRANSACTION HISTORY -----");

        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}