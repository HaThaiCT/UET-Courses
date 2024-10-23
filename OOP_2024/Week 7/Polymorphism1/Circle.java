public class Circle extends Shape {
    protected double radius;

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
        return "Circle[radius=" + radius + ",color=" + color + ",filled=" + filled + "]"; 
    }
}
