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
  }

  public void removeBookFromStore(int bookId) {
    // code here
    this.store.removeIf(b -> b.bookId == bookId);
    System.out.println("\nYou removed book with id " + bookId + " from store");
  }

  public List<Book> getBookStore() {
    return this.store;
  }

  public double getTotalBookPrice() {
    double totalPrice = 0;
    for (Book book : this.store) {
      totalPrice += book.price;
    }

    return totalPrice;
  }

  public void displayBookInStore() {
    System.out.println("\nYour store: ");

    for (Book book : this.store) {
      System.out.println(book);
    }
  }
}
