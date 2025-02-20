package Exercise2.Ex2_8;

public class MyCircle {
    private MyPoint center;
    private int radius = 1;

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyCircle() {
        this.center.setX(0);
        this.center.setY(0);
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCenterX() {
        return center.getX();
    }

    public void setCenterX(int x) {
        this.center.setX(x);
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterY(int y) {
        this.center.setY(y);
    }

    public int[] getCenterXY() {
        return new int[]{getCenterX(), getCenterY()};
    }

    public void setCenterXY(int x, int y) {
        this.center.setX(x);
        this.center.setY(y);
    }

    @Override
    public String toString() {
        return String.format("MyCircle[radius: %d, center = (%d, %d)]", radius, getCenterX(), getCenterY());
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }

    public double getCircumference() {
        return Math.PI*2*radius;
    }

    public double getDistance(MyCircle another) {
        return center.distance(another.center);
    }
}
