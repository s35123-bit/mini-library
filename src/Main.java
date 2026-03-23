public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("B1", "Jan", 300, true);
        Book b2 = new Book("B2", "Rowling", 400, true);
        Book b3 = new Book("B3", "Miki", 150, true);

        System.out.println("--- Initial Info ---");
        b1.printInfo();

        System.out.println("--- Borrowing Book 1 ---");
        b1.borrow();
        b1.printInfo();

        System.out.println("--- Returning Book 1 ---");
        b1.returnBook();
        b1.printInfo();

        Reader r1 = new Reader("MC", "MC", 1001);
        Reader r2 = new Reader("MC", "Smith", 1002);

        r1.increaseBorrowedCount();
        r1.printData();
        r2.printData();

        Library myLibrary = new Library(5);

        myLibrary.addBook(b1);
        myLibrary.addBook(b2);
        myLibrary.addBook(b3);

        myLibrary.printAvailableBooks();
        System.out.println("Total available: " + myLibrary.countAvailableBooks());

        System.out.println("\n--- Final Scenario ---");
        myLibrary.borrowBook("B1", r1);

        myLibrary.printAvailableBooks();
        r1.printData();

        myLibrary.returnBook("B1", r1);
        r1.printData();
    }
}