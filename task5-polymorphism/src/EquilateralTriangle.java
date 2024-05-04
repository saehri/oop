public class EquilateralTriangle extends Triangle {
  public EquilateralTriangle(String name, Double side) {
    super();
    this.name = name;
    this.side1 = side;
    this.side2 = side;
    this.side3 = side;
    this.calculateArea();
    this.calculatePerimeter();
  }

  public void calculateArea(Double side) {
    super.area = (Math.sqrt(3) / 4) * Math.pow(side, 2);
  }

  public void calculatePerimeter(Double side) {
    super.perimeter = side * 3;
  }

  public void getInfo() {
    System.out.print("EquilateralTriangle " + name + " info ");
    System.out.print(" area " + super.area);
    System.out.print(" with side: " + side1);
    System.out.println();
  }

}
