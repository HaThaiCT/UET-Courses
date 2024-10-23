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
        return "Square[side=" + this.width + ",color=" 
        + this.color + ",filled=" + this.filled + "]";
    }
}
