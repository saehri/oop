public class App {
  public static void main(String[] args) {
    // ========================== SQUARE
    Square square = new Square(10, 10);
    System.out.println("\nsquare width: " + square.width + " square length: " + square.length);
    System.out.println("square area: " + square.getArea());
    System.out.println("square perimeter: " + square.getPerimeter() + "\n");
    // ========================== SQUARE

  }
}
