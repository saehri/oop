/* Expected output = 0 1 2 3 6 11 20 37 */

public class Loop6 {
  public static void main(String[] args) {
    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;

    for (int i = 0; i < 8; i++) {
      if (i <= 2) {
        d = i;
      } else {
        d = a + b + c;
      }

      System.out.print(d + " ");
      a = b;
      b = c;
      c = d;
    }
  }
}
