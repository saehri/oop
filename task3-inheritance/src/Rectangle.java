public class Rectangle extends Shape {
  private double length;
  private double width;

  public Rectangle(String name, double length, double width) {
    super(name);
    this.length = length;
    this.width = width;
    calculateArea();
    calculatePerimeter();
  }

  private void calculateArea() {
    area = length * width;
  }

  private void calculatePerimeter() {
    perimeter = 2 * (length + width);
  }
}
