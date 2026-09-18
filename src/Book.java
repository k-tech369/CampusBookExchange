
public class Book {
    private String bookId;
    private String title;
    private String author;
    private String category;
    private String ownerId;
    private boolean available;

    public Book(String bookId, String title, String author,
                String category, String ownerId) {

        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.ownerId = ownerId;
        this.available = true;
    }

    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        String status = available ? "Available" : "Borrowed";

        return bookId + " | " + title + " | "
                + author + " | " + category
                + " | Owner: " + ownerId
                + " | " + status;
    }
}
