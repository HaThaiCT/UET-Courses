public class Point {
    private double pointX;
    private double pointY;

    /**
     * ht.
     * @param x 1
     * @param y 1
     */
    public Point(double x, double y) {
        pointX = x;
        pointY = y;
    }

    /**
     * ht.
     * @return
     */
    public double getPointX() {
        return pointX;
    }

    /**
     * ht.
     * @return
     */
    public double getPointY() {
        return pointY;
    }

    /**
     * ht.
     * @param x 1
     */
    public void setPointX(double x) {
        pointX = x;
    }

    /**
     * ht.
     * @param y 1
     */
    public void setPointY(double y) {
        pointY = y;
    }

    /**
     * ht.
     * @param other 1
     * @return
     */
    public double distance(Point other) {
        return Math.sqrt((pointX - other.getPointX()) * (pointX - other.getPointX()) 
        + (pointY - other.getPointY()) * (pointY - other.getPointY()));
    }
}
