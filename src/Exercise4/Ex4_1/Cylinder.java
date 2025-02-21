package Exercise4.Ex4_1;

public class Cylinder extends Circle{
    private double height = 1;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        this.radius = radius;
    }

    public Cylinder() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea()*height;
    }

    @Override
    public String toString() {      // in Cylinder class
        return "Cylinder: subclass of " + super.toString()  // use Circle's toString()
                + " height=" + height;
    }
}
