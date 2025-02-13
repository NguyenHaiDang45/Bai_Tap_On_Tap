package Exercise1;

public class Ex1_2_AnotherCircle {
    private double radius;

    public Ex1_2_AnotherCircle(double radius) {
        this.radius = radius;
    }

    public Ex1_2_AnotherCircle() {
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
