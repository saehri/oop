public class IsoseclesTriangle extends Triangle {
  private Double base;
  private Double height;

  public IsoseclesTriangle(String name, Double base, Double height) {
    super();
    this.name = name;
    this.base = base;
    this.height = height;
    this.calculateArea();
    super.side1 = base;
    super.side2 = height;
  }

  public void calculateArea() {
    super.area = (height * base) / 2;
  }

  public void getInfo() {
    System.out.print("IsoseclesTriangle " + name + " info ");
    System.out.print(" area " + super.area);
    System.out.print(" with base: " + base);
    System.out.print(" and height: " + height);
    System.out.println();
  }
}