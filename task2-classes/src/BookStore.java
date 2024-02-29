import java.util.ArrayList;
import java.util.List;

public class BookStore {
  private List<Book> store;

  public BookStore() {
    this.store = new ArrayList<>();
  }

  // ===== BOOK COLLECTION CONTROLLER
  public void addBookToStore(Book book) {
    this.store.add(book);
    System.out.println("\nYour store: ");

    this.displayBookInStore();
  }

  public void removeBookFromStore(int bookId) {
    // code here
    this.store.removeIf(b -> b.bookId == bookId);
    System.out.println("\nYou removed book with id " + bookId + " from store");
    System.out.println("Your store: ");

    this.displayBookInStore();
  }

  public List<Book> getBookStore() {
    return this.store;
  }

  public int getTotalBookPrice() {
    int totalPrice = 0;
    for (Book book : this.store) {
      totalPrice += book.price;
    }

    return totalPrice;
  }

  public void displayBookInStore() {
    for (Book book : this.store) {
      System.out.println(book);
    }
  }
}
