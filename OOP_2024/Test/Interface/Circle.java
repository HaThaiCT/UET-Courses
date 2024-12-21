public class Circle implements GeometricObject {
    public static final double  PI = 3.14;
    private Point center;
    private double radius;

    /**
     * ht.
     * @param center 1
     * @param radius 1
     */
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
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
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * ht.
     */
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    /**
     * ht.
     */
    public String getInfo() {
        return String.format("Circle[(%.2f,%.2f),r=%.2f]", 
        center.getPointX(), center.getPointY(), radius);
    }
}
