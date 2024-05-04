public class Main {
  public static void main(String[] args) {
    FunStringStuff fns = new FunStringStuff("bahri");
    System.out.println("1. Pattern 1");
    fns.showPatterOne();
    System.out.println("\n2. Pattern 2");
    fns.showPatternTwo();
    System.out.println("\n3. Pattern 3");
    fns.showPatternThree();
    fns.setString("newton");
    System.out.println("\n4. Pattern 3 with even string");
    fns.showPatternThree();
  }
}