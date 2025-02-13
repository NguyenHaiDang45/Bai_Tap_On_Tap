package Exercise1;

public class Ex1_3_Rectangle {
    private float length;
    private float width;

    public Ex1_3_Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public Ex1_3_Rectangle() {
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return length*width;
    }

    public double getPerimeter() {
        return (length + width) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle[length = " + length + ", width = " + width + "]";
    }
}
