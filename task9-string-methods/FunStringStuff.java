public class FunStringStuff {
  String string;

  public FunStringStuff(String data) {
    this.string = data.toUpperCase();
  }

  public void setString(String data) {
    this.string = data.toUpperCase();
  }

  public void showPatterOne() {
    for (int i = 0; i < string.length(); i++) {
      String leftPart = string.substring(0, string.length() - i);
      String rightPart = "*".repeat(i);
      System.out.println(leftPart + rightPart);
    }
  }

  public void showPatternTwo() {
    for (int i = 0; i < string.length(); i++) {
      String leftPart = "*".repeat(i);
      Character midPart = string.charAt(i);
      String rightPart = "*".repeat(string.length() - i - 1);
      System.out.println(leftPart + midPart + rightPart);
    }
  }

  public void showPatternThree() {
    Boolean isEven = string.length() % 2 == 0;
    Integer mid = (int) Math.floor(string.length() / 2);

    for (int i = 0; i < string.length(); i++) {
      if (i == mid && !isEven) {
        System.out.println(string);
        continue;
      }

      System.out.println("*".repeat(mid) + string.charAt(i) + "*".repeat(mid));
    }
  }
}