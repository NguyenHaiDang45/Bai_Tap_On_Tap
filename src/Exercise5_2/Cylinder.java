package Exercise5_2;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder(double radius, String color, double height) {
        this.base = new Circle(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBaseRadius() {
        return base.getRadius();
    }

    public void setBaseRadius(double radius) {
        base.setRadius(radius);
    }

    public String getBaseColor() {
        return base.getColor();
    }

    public void setBaseColor(String color) {
        base.setColor(color);
    }

    public double getVolume() {
        return base.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder[base=" + base.toString() + ", height=" + height + "]";
    }
}
