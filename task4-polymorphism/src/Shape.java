public class Shape {
  protected Double area;
  protected Double perimeter;
  protected String name;

  public void setName(String name) {
    this.name = name;
  }

  public void getInfo() {
    System.out.println("Name: " + this.name);
    System.out.println("Area: " + this.area);
    System.out.println("Perimeter: " + this.perimeter);
  }
}