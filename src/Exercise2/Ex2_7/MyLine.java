package Exercise2.Ex2_7;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin.setXY(x1, y1);
        this.end.setXY(x2, y2);
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        this.begin.setX(x);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        this.begin.setY(y);
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        this.end.setX(x);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        this.end.setY(y);
    }

    public int[] getBeginXY() {
        return new int[]{getBeginX(), getBeginY()};
    }

    public void setBeginXY(int x, int y) {
        this.begin.setX(x);
        this.begin.setY(y);
    }

    public int[] getEndXY() {
        return new int[]{getEndX(), getEndY()};
    }

    public void setEndXY(int x, int y) {
        this.end.setX(x);
        this.end.setY(y);
    }

    public double getLength() {
        return begin.distance(end);
    }

    public double getGradient() {
        double xDiff = end.getX() - begin.getX();
        double yDiff = end.getY() - begin.getY();

        return Math.atan2(yDiff, xDiff);
    }

    @Override
    public String toString() {
        return String.format("MyLine[begin(%d, %d), end(%d, %d)]", begin.getX(), begin.getY(), end.getX(), end.getY());
    }
}
