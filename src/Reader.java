public class Reader {
    // Fields [cite: 54]
    private String firstName;
    private String lastName;
    private int cardNumber;
    private int borrowedCount;

    public Reader(String firstName, String lastName, int cardNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
        this.borrowedCount = 0;
    }

    // Methods [cite: 55]
    public void printData() {
        System.out.println("Reader: " + firstName + " " + lastName + " | ID: " + cardNumber + " | Borrowed: " + borrowedCount);
    }

    public void increaseBorrowedCount() {
        this.borrowedCount++;
    }

    public void decreaseBorrowedCount() {
        if (this.borrowedCount > 0) {
            this.borrowedCount--;
        }
    }
}