import java.util.Objects;

public class Square extends Rectangle {

    /**
     * ht.
     */
    public Square() {}

    /**
     * ht.
     * @param side 1
     */
    public Square(double side) {
        this.width = side;
        this.length = side;
    }

    /**
     * ht.
     * @param side 1
     * @param color 1
     * @param filled 1
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * ht.
     * @param topLeft 1
     * @param side 1
     * @param color 1
     * @param filled 1
     */
    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
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
    public void getTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * ht.
     * @return
     */
    public double getSide() {
        return this.length;
    }

    /**
     * ht.
     * @param side 1
     */
    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    /**
     * ht.
     */
    @Override
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    /**
     * ht.
     */
    @Override
    public void setLength(double side) {
        this.width = side;
        this.length = side;
    }

    /**
     * ht.
     */
    public String toString() {
        return "Square[topLeft=" + this.topLeft.toString()
                + ",side=" + this.width + ",color="
                + this.color + ",filled=" + this.filled + "]";
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
        if (!(o instanceof Square)) {
            return false;
        }
        Square square = (Square) o;
        return Math.abs(getWidth() - square.getWidth()) < 0.001
                && getTopLeft().equals(square.getTopLeft());
    }

    /**
     * ht.
     * @return
     */
    public int hashCode() {
        return Objects.hash(this.width, this.length, this.topLeft);
    }
}
