import java.util.Objects;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    protected Point topLeft;

    /**
     * ht.
     */
    public Rectangle() {}

    /**
     * ht.
     * @param width 1
     * @param length 1
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * ht.
     * @param width 1
     * @param length 1 
     * @param color 1
     * @param filled 1
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * ht.
     * @param topLeft 1
     * @param width 1
     * @param length 1
     * @param color 1
     * @param filled 1
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
        this.topLeft = topLeft;
    }

    /**
     * ht.
     * @return
     */
    public Point getTopLeft() {
        return this.topLeft;
    }

    /**
     * ht.
     * @param topLeft 1
     */
    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * ht.
     * @return
     */
    public double getWidth() {
        return this.width;
    }

    /**
     * ht.
     * @param width 1
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * ht.
     * @return
     */
    public double getLength() {
        return this.length;
    }

    /**
     * ht.
     * @param length 1
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * ht.
     */
    @Override
    public double getArea() {
        return (this.width * this.length);
    }

    /**
     * ht.
     */
    @Override
    public double getPerimeter() {
        return (this.width + this.length) * 2;
    }

    /**
     * ht.
     */
    public String toString() {
        return "Rectangle[topLeft=" + this.topLeft.toString()
                + ",width=" + this.width + ",length=" + this.length
                + ",color=" + this.color + ",filled=" + this.filled + "]";
    }

    /**
     * ht.
     * @param o 1
     * @return
     */
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Rectangle)) {
            return false;
        }
        Rectangle rectangle = (Rectangle) o;
        return Math.abs(width - rectangle.width) < 0.001
                && Math.abs(length - rectangle.length) < 0.001
                && topLeft.equals(rectangle.topLeft);
    }

    /**
     * ht.
     * @return
     */
    public int hashCode() {
        return Objects.hash(this.width, this.length, this.topLeft);
    }
}