/* Expected output: 1 1 2 3 5 8 13 21 */

public class Loop5 {
  public static void main(String[] args) {
    for (int i = 0; i < 8; i++) {
      System.out.print(fibonacci(i) + " ");
    }
  }

  public static int fibonacci(int n) {
    if (n == 0) {
      return 1;
    }

    if (n == 1) {
      return 1;
    }

    int prevNumber = 1;
    int currentNumber = 1;
    int nextNumber = 0;

    for (int i = 2; i <= n; i++) {
      nextNumber = prevNumber + currentNumber;
      prevNumber = currentNumber;
      currentNumber = nextNumber;
    }

    return currentNumber;
  }
}
