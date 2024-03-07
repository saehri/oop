public class Triangle extends Shape {
  private double side1;
  private double side2;
  private double side3;

  public Triangle(String name, double side1, double side2, double side3) {
    super(name);
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
    calculateArea();
    calculatePerimeter();
  }

  private void calculateArea() {
    double s = (side1 + side2 + side3) / 2;
    area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
  }

  private void calculatePerimeter() {
    perimeter = side1 + side2 + side3;
  }
}