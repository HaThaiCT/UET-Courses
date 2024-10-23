public class Cylinder extends Circle {
    private double height;

    /**
     * normal contructor.
     */
    public Cylinder() {

    }

    /**
     * 1.
     * @param height h
     */
    public Cylinder(double height) {
        this.height = height;
    }

    /**
     * 1.
     * @param radius r
     * @param height h
     */
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    /**
     * 1.
     * @param radius r
     * @param height h
     * @param color c
     */
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    /**
     * 1.
     * @return
     */
    public double getHeight() {
        return this.height;
    }

    /**
     * 1.
     * @param height h
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * 1.
     * @return
     */
    public double getVolume() {
        return this.getArea() * this.height;
    }
    
    /**
     * 1.
     */
    public String toString() {
        return "Cylinder[" + super.toString() + ",height=" + height + "]";
    }

    /**
     * 1.
     */
    public double getArea() {
        return super.getArea();
    }
}
