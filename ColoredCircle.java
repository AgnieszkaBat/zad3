package geometry;
import java.awt.Color;
public class ColoredCircle extends Circle {
}
private Color color;
public ColoredCircle(Point center, double radius, Color color) {
    super(center, radius);
    this.color = color;
}
public Color getColor() {
    return color;
}
public void setColor(Color color) {
    this.color = color;
}
@Override
public String toString() {
    return "ColoredCircle{" +
            "center=" + getCenter() +
            ", radius=" + getRadius() +
            ", color=" + color +
            '}';
}
