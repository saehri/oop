public class App {
    public static void main(String[] args) throws Exception {
        RightTriangle ABC = new RightTriangle("ABC", 3.0, 4.0);
        Triangle BCD = new RightTriangle("BCD", 3.0, 4.0);
        Triangle CDE = new Triangle("CDE", 3.0, 4.0, 5.0);

        IsoseclesTriangle DEF = new IsoseclesTriangle("DEF", 3.0, 4.0);
        EquilateralTriangle EFG = new EquilateralTriangle("EFG", 3.0);

        ABC.getInfo();
        BCD.getInfo();
        CDE.getInfo();
        DEF.getInfo();
        EFG.getInfo();
    }
}
