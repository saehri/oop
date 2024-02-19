/* Expected output: -3, -1, 2, 6, 11, 17, 24 */

public class Loop4 {
  public static void main(String[] args) {
    int a = 1;
    int b = -3;
    for (int i = 0; i < 7; i++) {
      a++;
      System.out.print(b + " ");
      b += a;
    }
  }
}