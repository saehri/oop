public class Square {
  public int width;
  public int length;

  public Square(int width, int length) {
    this.width = width;
    this.length = length;
  }

  public void setHeight(int length) {
    this.length = length;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getArea() {
    return this.width * this.length;
  }

  public int getPerimeter() {
    return (this.length + this.width) * 2;
  }
}
