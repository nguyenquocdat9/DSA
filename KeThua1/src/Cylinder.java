public class Cylinder extends Circle {
    private double height;
    
    /** contructor1. */
    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    /** contructor2. */
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    /** constructor3. */
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    /** get height. */
    public double getHeight() {
        return height;
    }

    /** set height. */
    public void setHeight(double height) {
        this.height = height;
    }

    /** get volume. */
    public double getVolume() {
        return height * getArea();
    }

    /** to string2. */
    public String toString() {
        return "Cylinder[" + super.toString() + ",height=" + height + "]";
    }

    /** get area. */
    public double getArea() {
        double p = this.getRadius() * 2 * PI;
        return (super.getArea() * 2) + (p * height);
    }

    public static void main(String[] args) {
        Cylinder cy = new Cylinder(2, 4, "red");
        System.out.println(cy.getArea());
    }
}