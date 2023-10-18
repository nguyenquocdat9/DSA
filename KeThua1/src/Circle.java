public class Circle {
    private double radius;
    private String color;
    protected static final double PI = 3.14;

    /** contructor1. */
    public Circle() {
    }

    /** contructor2. */
    public Circle(double radius) {
        this.radius = radius;
    }

    /** contructor3. */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /** get radius. */
    public double getRadius() {
        return radius;
    }

    /** set radius. */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** get color. */
    public String getColor() {
        return color;
    }

    /** set color. */
    public void setColor(String color) {
        this.color = color;
    }

    /** get area. */
    public double getArea() {
        return PI * radius * radius;
    }

    /** to string. */
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
}
