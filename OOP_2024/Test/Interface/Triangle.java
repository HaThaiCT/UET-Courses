public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * ht.
     * @param p1 1
     * @param p2 1
     * @param p3 1
     */
    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        if (this.getArea() == 0) {
            throw new RuntimeException();
        }
    }

    /**
     * ht.
     * @return
     */
    public Point getP1() {
        return this.p1;
    }

    /**
     * ht.
     * @return
     */
    public Point getP2() {
        return this.p2;
    }

    /**
     * ht.
     * @return
     */
    public Point getP3() {
        return this.p3;
    }

    /**
     * ht.
     */
    public double getPerimeter() {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

    /**
     * ht.
     */
    public double getArea() {
        return Math.abs(p1.getPointX() * (p2.getPointY() - p3.getPointY()) 
        + p2.getPointX() * (p3.getPointY() - p1.getPointY()) 
        + p3.getPointX() * (p1.getPointY() - p2.getPointY())) / 2;
    }

    /**
     * ht.
     */
    public String getInfo() {
        return String.format("Triangle[(%.2f,%.2f),(%.2f,%.2f),(%.2f,%.2f)]", 
        p1.getPointX(), p1.getPointY(), p2.getPointX(), p2.getPointY(), 
        p3.getPointX(), p3.getPointY());
    }

}