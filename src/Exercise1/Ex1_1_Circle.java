package Exercise1;

public class Ex1_1_Circle {
    private double radius;
    private String color;

    public Ex1_1_Circle(double radius, String color) {
        this.radius = 1;
        this.color = "red";
    }

    public Ex1_1_Circle() {
    }

    public Ex1_1_Circle(double radius) {
        this.radius = radius;
        color = "red";
    }

    @Override
    public String toString() {
        return "Circle[" + "radius = " + radius + ", color = " + color + "]";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }
}
