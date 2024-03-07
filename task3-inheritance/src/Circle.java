public class Circle extends Shape {
  private double radius;

  public Circle(String name, double radius) {
    super(name);
    this.radius = radius;
    calculateArea();
    calculatePerimeter();
  }

  private void calculateArea() {
    area = Math.PI * radius * radius;
  }

  private void calculatePerimeter() {
    perimeter = 2 * Math.PI * radius;
  }
}
