/**
 * Represents a chess piece with coordinates and color.
 */
public abstract class Piece {
    private int coordinatesX;
    private int coordinatesY;
    private String color;

    /**
     * Creates a new piece with specified coordinates.
     * @param x The x-coordinate
     * @param y The y-coordinate
     */
    public Piece(int x, int y) {
        this.coordinatesX = x;
        this.coordinatesY = y;
        this.color = "white";
    }

    /**
     * Creates a new piece with specified coordinates and color.
     * @param x The x-coordinate
     * @param y The y-coordinate
     * @param color The color of the piece
     */
    public Piece(int x, int y, String color) {
        this.coordinatesX = x;
        this.coordinatesY = y;
        this.color = color;
    }

    /**
     * Gets the symbol representing this piece.
     * @return The symbol as a string
     */
    public abstract String getSymbol();

    /**
     * Checks if the piece can move to the specified position on the board.
     * @param board The game board
     * @param x The target x-coordinate
     * @param y The target y-coordinate
     * @return true if the move is valid, false otherwise
     */
    public abstract boolean canMove(Board board, int x, int y);

    /**
     * Gets the x-coordinate of the piece.
     * @return The x-coordinate
     */
    public int getCoordinatesX() {
        return this.coordinatesX;
    }

    /**
     * Sets the x-coordinate of the piece.
     * @param x The new x-coordinate
     */
    public void setCoordinatesX(int x) {
        this.coordinatesX = x;
    }

    /**
     * Gets the y-coordinate of the piece.
     * @return The y-coordinate
     */
    public int getCoordinatesY() {
        return coordinatesY;
    }

    /**
     * Sets the y-coordinate of the piece.
     * @param y The new y-coordinate
     */
    public void setCoordinatesY(int y) {
        this.coordinatesY = y;
    }

    /**
     * Gets the color of the piece.
     * @return The color as a string
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Sets the color of the piece.
     * @param color The new color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Checks if this piece can be placed at the specified position.
     * @param piece The piece to check against
     * @return true if the position is valid, false otherwise
     */
    public boolean checkPosition(Piece piece) {
 
        int x = piece.getCoordinatesX();
        int y = piece.getCoordinatesY();
        return x == coordinatesX && y == coordinatesY;
    }
}