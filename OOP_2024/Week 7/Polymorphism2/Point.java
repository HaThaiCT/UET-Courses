public class Point {
    private double pointX;
    private double pointY;

    /**
     * ht.
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /**
     * ht.
     * @return
     */
    public double getPointX() {
        return this.pointX;
    }

    /**
     * ht. 
     */
    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /**
     * ht.
     * @return
     */
    public double getPointY() {
        return this.pointY;
    }

    /**
     * ht. 
     */
    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * HT.
     * @param newPoint 1
     * @return
     */
    public double distance(Point newPoint) {
        return Math.sqrt((this.pointX - newPoint.pointX) * (this.pointX - newPoint.pointX)
        + (this.pointY - newPoint.pointY) * (this.pointY - newPoint.pointY));
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
        if (!(o instanceof Point)) {
            return false;
        }
        Point point = (Point) o;
        return Math.abs(pointX - point.pointX) < 0.001 && Math.abs(pointY - point.pointY) < 0.001;
    }

    /**
     * ht.
     * @return
     */
    public int hashCode() {
        return Double.hashCode(pointX) + Double.hashCode(pointY);
    }

    /**
     * ht.
     * @return
     */
    public String toString() {
        return "(" + pointX + "," + pointY + ")";
    }



}
