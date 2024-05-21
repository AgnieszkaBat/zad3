public class Main {

    public static void main(String[] args) {
        // Create a Point object for the circle's center
        Point center = new Point(3.5, 4.2);

        // Create a Circle object with the specified center and radius
        double radius = 5.0;
        Circle circle = new Circle(center, radius);

        // Display information about the circle
        System.out.println("Circle:");
        System.out.println("Center: " + circle.getCenter());
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        System.out.println("Area: " + circle.calculateArea());

        // Modify the circle's center coordinates
        circle.setCenter(new Point(6.1, 2.8));

        // Update the radius of the circle
        circle.setRadius(7.2);

        // Display the updated circle information
        System.out.println("\nCircle after modifications:");
        System.out.println("Center: " + circle.getCenter());
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        System.out.println("Area: " + circle.calculateArea());
    }
}
