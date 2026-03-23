public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("The Witcher", "Andrzej Sapkowski", 300, true);
        Book b2 = new Book("Harry Potter", "J.K. Rowling", 400, true);
        Book b3 = new Book("Java Programming", "Piotr Gago", 150, true);

        System.out.println("--- Initial Info ---");
        b1.printInfo();

        System.out.println("--- Borrowing Book 1 ---");
        b1.borrow();
        b1.printInfo();

        System.out.println("--- Returning Book 1 ---");
        b1.returnBook();
        b1.printInfo();
    }
}