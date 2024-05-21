package geometry; // Assuming the 'geometry' package is appropriate

import java.awt.Color;

public class Main {

    public static void main(String[] args) {
        // Create a Point object for the circle's center
        Point center = new Point(3.5, 4.2);

        // Define the circle's radius
        double radius = 5.0;

        // Create a ColoredCircle object with desired color
        Color color = Color.BLUE; // Pick your desired color
        ColoredCircle coloredCircle = new ColoredCircle(center, radius, color);

        // Display information about the colored circle
        System.out.println("Colored Circle:");
        System.out.println("Center: " + coloredCircle.getCenter());
        System.out.println("Radius: " + coloredCircle.getRadius());
        System.out.println("Color: " + coloredCircle.getColor()); // Access color information
        System.out.println("Perimeter: " + coloredCircle.calculatePerimeter()); // Inherited from Circle
        System.out.println("Area: " + coloredCircle.calculateArea()); // Inherited from Circle

        // Modify the colored circle's center (inherited behavior)
        coloredCircle.setCenter(new Point(6.1, 2.8));

        // Modify the colored circle's radius (inherited behavior)
        coloredCircle.setRadius(7.2);

        // Display updated information about the colored circle
        System.out.println("\nColored Circle after modifications:");
        System.out.println("Center: " + coloredCircle.getCenter());
        System.out.println("Radius: " + coloredCircle.getRadius());
        System.out.println("Color: " + coloredCircle.getColor()); // Color remains the same
        System.out.println("Perimeter: " + coloredCircle.calculatePerimeter()); // Inherited from Circle
        System.out.println("Area: " + coloredCircle.calculateArea()); // Inherited from Circle
    }
}
