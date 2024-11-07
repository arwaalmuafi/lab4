public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Radius: " + circle.getRadius());
        System.out.printf("Area: %.2f%n", circle.calculateArea());
        System.out.printf("Circumference: %.2f%n", circle.calculateCircumference());
//___________________________________________________________________________________________
        System.out.println("_____________________");
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.printf("Area: %.2f%n", rectangle.calculateArea());
        System.out.printf("Perimeter: %.2f%n", rectangle.calculateCircumference());
//_____________________________________________________________________________________________-
        System.out.println("_____________________");
        Triangle triangle = new Triangle(5.0, 4.0);
        System.out.println("Height: " + triangle.getHeight());
        System.out.println("Base: " + triangle.getBase());
        System.out.printf("Area: %.2f%n", triangle.calculateArea());
        System.out.printf("Perimeter: %.2f%n", triangle.calculateCircumference());
    }
}