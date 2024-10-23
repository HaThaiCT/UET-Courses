public class Circle {
    private double radius;
    private String color;
    protected static final double PI = 3.14;

    /**
     * normal contructor.
     */
    public Circle() {
    
    }

    /**
     * contructor.
     * @param radius radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * contructor.
     * @param radius radius
     * @param color color
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /**
     * getter.
     * @return
     */
    public double getRadius() {
        return this.radius;
    }

    /**
     * setter.
     * @param radius radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * getter.
     * @return
     */
    public String getColor() {
        return this.color;
    }

    /**
     * setter.
     * @param color color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * tinh dien tich.
     * @return
     */
    public double getArea() {
        return PI * this.radius * this.radius;
    }

    /**
     * In thong so.
     */
    public String toString() {
        return "Circle[ radius=" + this.radius + ",color=" + this.color + "]";
    }
    
}