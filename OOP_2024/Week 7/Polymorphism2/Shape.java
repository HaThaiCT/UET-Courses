public abstract class Shape {
    protected String color;
    protected boolean filled;

    /**
     * h.
     */
    public Shape() {
        this.color = "";
        this.filled = false;
    }

    /**
     * t.
     * @param color 1
     * @param filled 1
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * h.
     * @return
     */
    public String getColor() {
        return this.color;
    }

    /**
     * h.
     * @param color 1
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * h.
     * @return 1
     */
    public boolean isFilled() {
        return this.filled;
    }

    /**
     * ht.
     * @param filled 1
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /*
     * ht.
     */
    public abstract double getArea();

    /*
     * ht.
     */
    public abstract double getPerimeter();

    /**
     * ht.
     */
    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]"; 
    }
}