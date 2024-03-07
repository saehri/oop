public class RightTriangle extends Triangle {
  public RightTriangle(String name, double base, double height) {
    super(name, base, height, Math.sqrt(base * base + height * height));
  }
}
