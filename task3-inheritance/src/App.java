import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Choose the shape to create:");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Right Triangle");
            System.out.println("4. Equilateral Triangle");
            System.out.println("5. Isosceles Triangle");
            System.out.println("6. Scalene Triangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    createRectangle(scanner);
                    break;
                case 2:
                    createCircle(scanner);
                    break;
                case 3:
                    createRightTriangle(scanner);
                    break;
                case 4:
                    createEquilateralTriangle(scanner);
                    break;
                case 5:
                    createIsoscelesTriangle(scanner);
                    break;
                case 6:
                    createScaleneTriangle(scanner);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void createRectangle(Scanner scanner) {
        System.out.println("Enter name of the rectangle:");
        String name = scanner.nextLine();
        System.out.println("Enter length of the rectangle:");
        double length = scanner.nextDouble();
        System.out.println("Enter width of the rectangle:");
        double width = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(name, length, width);
        displayShapeDetails(rectangle);
    }

    private static void createCircle(Scanner scanner) {
        System.out.println("Enter name of the circle:");
        String name = scanner.nextLine();
        System.out.println("Enter radius of the circle:");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(name, radius);
        displayShapeDetails(circle);
    }

    private static void createRightTriangle(Scanner scanner) {
        System.out.println("Enter name of the triangle:");
        String name = scanner.nextLine();
        System.out.println("Enter base of the right triangle:");
        double base = scanner.nextDouble();
        System.out.println("Enter height of the right triangle:");
        double height = scanner.nextDouble();

        RightTriangle rightTriangle = new RightTriangle(name, base, height);
        displayShapeDetails(rightTriangle);
    }

    private static void createEquilateralTriangle(Scanner scanner) {
        System.out.println("Enter name of the triangle:");
        String name = scanner.nextLine();
        System.out.println("Enter side length of the equilateral triangle:");
        double side = scanner.nextDouble();

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(name, side);
        displayShapeDetails(equilateralTriangle);
    }

    private static void createIsoscelesTriangle(Scanner scanner) {
        System.out.println("Enter name of the triangle:");
        String name = scanner.nextLine();
        System.out.println("Enter base of the isosceles triangle:");
        double base = scanner.nextDouble();
        System.out.println("Enter length of the equal side of the isosceles triangle:");
        double equalSide = scanner.nextDouble();

        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(name, base, equalSide);
        displayShapeDetails(isoscelesTriangle);
    }

    private static void createScaleneTriangle(Scanner scanner) {
        System.out.println("Enter name of the triangle:");
        String name = scanner.nextLine();
        System.out.println("Enter length of side 1 of the scalene triangle:");
        double side1 = scanner.nextDouble();
        System.out.println("Enter length of side 2 of the scalene triangle:");
        double side2 = scanner.nextDouble();
        System.out.println("Enter length of side 3 of the scalene triangle:");
        double side3 = scanner.nextDouble();

        ScaleneTriangle scaleneTriangle = new ScaleneTriangle(name, side1, side2, side3);
        displayShapeDetails(scaleneTriangle);
    }

    public static void displayShapeDetails(Shape shape) {
        System.out.println("Shape: " + shape.getName());
        System.out.println("Area: " + shape.getArea());
        System.out.println("Perimeter: " + shape.getPerimeter());
        System.out.println();
    }
}
