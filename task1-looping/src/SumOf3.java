public class SumOf3 {
  private int a;
  private int b;
  private int c;

  public SumOf3(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public void displayResult(int maxLoop) {
    int a = this.a, b = this.b, c = this.c, d = 0;

    System.out.print(this.a + " " + this.b + " " + this.c + " ");
    for (int i = 0; i < maxLoop; i++) {
      if (i > 2) {
        d = a + b + c;
      } else
        continue;

      System.out.print(d + " ");
      a = b;
      b = c;
      c = d;
    }
  }
}
