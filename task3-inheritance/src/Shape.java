public class Shape {
  protected String name;
  protected double area;
  protected double perimeter;

  public Shape(String name) {
    this.name = name;
  }

  // Getters and Setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getArea() {
    return area;
  }

  public void setArea(double area) {
    this.area = area;
  }

  public double getPerimeter() {
    return perimeter;
  }

  public void setPerimeter(double perimeter) {
    this.perimeter = perimeter;
  }
}