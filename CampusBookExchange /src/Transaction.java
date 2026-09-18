public class Transaction {
    private String transactionId;
    private String bookId;
    private String studentId;
    private String action;

    public Transaction(String transactionId, String bookId,
                       String studentId, String action) {

        this.transactionId = transactionId;
        this.bookId = bookId;
        this.studentId = studentId;
        this.action = action;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getBookId() {
        return bookId;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getAction() {
        return action;
    }

    @Override
    public String toString() {
        return transactionId + " | Book: "
                + bookId + " | Student: "
                + studentId + " | " + action;
    }
}
