public class App {
  public static void main(String[] args) {
    // ========================== SQUARE
    Square square = new Square(10, 10);
    System.out.println("\nsquare width: " + square.width + " square length: " + square.length);
    System.out.println("square area: " + square.getArea());
    System.out.println("square perimeter: " + square.getPerimeter() + "\n");
    // ========================== SQUARE

    System.out.println("-------------------------------------------------");

    // Initialize the book store
    BookStore bookStore = new BookStore();

    // Add initial data to store
    bookStore.addBookToStore(new Book(0, "The Life of Me", "James", 120, 1));
    bookStore.addBookToStore(new Book(1, "Happy Life Happy Me", "James", 90, 1));
    bookStore.addBookToStore(new Book(2, "How it Works", "James", 60, 1));

    // Remove book with id 1 from store;
    bookStore.removeBookFromStore(1);

    // Get total price of books in the store;
    System.out.println("The total of books in the store is " + bookStore.getTotalBookPrice());
  }
}
