package Exercise1.Ex1_2;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle[" + "radius = " + radius + "]";
    }

    public double getCircumference() {
        return 2*Math.PI*radius;
    }
}
