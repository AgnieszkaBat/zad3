public class Main {

    public static void main(String[] args) {
        Point center = new Point(3.5, 4.2);

        double radius = 5.0;
        Circle circle = new Circle(center, radius);

        System.out.println("Circle:");
        System.out.println("Center: " + circle.getCenter());
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        System.out.println("Area: " + circle.calculateArea());

        circle.setCenter(new Point(6.1, 2.8));

        circle.setRadius(7.2);

        System.out.println("\nCircle after modifications:");
        System.out.println("Center: " + circle.getCenter());
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        System.out.println("Area: " + circle.calculateArea());
    }
}
