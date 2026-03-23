public class Library {
    private Book[] books;
    private int bookCount;
    public Library(int capacity) {
        this.books = new Book[capacity];
        this.bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("Library is full! Cannot add: " + book);
        }
    }

    public void printAvailableBooks() {
        System.out.println("--- Available Books ---");
        for (int i = 0; i < bookCount; i++) {
            books[i].printInfo();
        }
    }

    public Book findBookByTitle(String title) {
        for (int i = 0; i < bookCount; i++) {

        }
        return null;
    }

    public int countAvailableBooks() {
        int count = 0;
        for (int i = 0; i < bookCount; i++) {
            count++;
        }
        return count;
    }

    public void borrowBook(String title, Reader reader) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title) && books[i].isAvailable()) {
                books[i].borrow();
                reader.increaseBorrowedCount();
                System.out.println("Success! " + title + " has been borrowed by " + reader.getLastName());
                return;
            }
        }
        System.out.println("Sorry, the book '" + title + "' is not available.");
    }

    public void returnBook(String title, Reader reader) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                books[i].returnBook();
                reader.decreaseBorrowedCount();
                System.out.println("Success! " + title + " has been returned.");
                return;
            }
        }
    }
}