
public class Rectangle extends Shape {
    protected double width;
    protected double length;

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
        return "Rectangle[width=" + this.width + ",length=" + this.length
                + ",color=" + this.color + ",filled=" + this.filled + "]";
    }
}