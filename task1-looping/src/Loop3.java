/* Exprected output: 1, 2, 4, 7, 11, 16, 22 */

public class Loop3 {
  public static void main(String[] args) {
    int a = 0;
    int b = 1;

    for (int i = 0; i < 7; i++) {
      a++;
      System.out.print(b + " ");
      b += a;
    }
  }
}
