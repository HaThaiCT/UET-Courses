import java.util.Objects;

public class Circle extends Shape {
    protected double radius;
    protected Point center;

    /**
     * ht.
     */
    public Circle() {
        this.radius = 0;
    }

    /**
     * ht.
     * @param radius 1
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * ht.
     * @param radius 1
     * @param color 1
     * @param filled 1
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * ht.
     * @param center 1
     * @param radius 1
     * @param color 1
     * @param filled 1
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        this.center = center;
    }

    /**
     * ht.
     * @return
     */
    public Point getCenter() {
        return this.center;
    }

    /**
     * ht.
     * @param center 1
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * ht.
     * @return
     */
    public double getRadius() {
        return this.radius;
    }

    /**
     * ht.
     * @param radius 1
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * ht.
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    } 

    /**
     * ht.
     */
    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /**
     * ht.
     */
    public String toString() {
        return "Circle[center=" + center.toString()
                + ",radius=" + radius + ",color="
                + color + ",filled=" + filled + "]";
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
        if (!(o instanceof Circle)) {
            return false;
        }
        Circle circle = (Circle) o;
        return Math.abs(this.radius - circle.radius) < 0.001
                && this.center.equals(circle.center);
    }

    /**
     * ht.
     */
    public int hashCode() {
        return Objects.hash(this.radius, this.center);
    }
}
