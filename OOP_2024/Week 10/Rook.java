public class Rook extends Piece {

    /**
     * Creates a new Rook at the specified position.
     * @param x The x-coordinate
     * @param y The y-coordinate
     */
    public Rook(int x, int y) {
        super(x, y);
    }

    /**
     * Creates a new Rook at the specified position with a color.
     * @param x The x-coordinate
     * @param y The y-coordinate
     * @param color The color of the rook
     */
    public Rook(int x, int y, String color) {
        super(x, y, color);
    }

    /**
     * Gets the symbol representing the Rook.
     * @return The symbol as a string
     */
    @Override
    public String getSymbol() {
        return "R";
    }

    /**
     * Checks if the Rook can move to the specified position on the board.
     * @param board The game board
     * @param x The target x-coordinate
     * @param y The target y-coordinate
     * @return true if the move is valid, false otherwise
     */
    @Override
    public boolean canMove(Board board, int x, int y) {
    if (!board.validate(x, y)) {
        return false;
    }

    if (x != this.getCoordinatesX() && y != this.getCoordinatesY()) {
        return false;
    }

    int currentX = this.getCoordinatesX();
    int currentY = this.getCoordinatesY();

    if (x == currentX) { 
        int step = (y > currentY) ? 1 : -1;
        for (int i = currentY + step; i != y; i += step) {
            if (board.getAt(x, i) != null) {
                return false; 
            }
        }
    } else if (y == currentY) { 
        int step = (x > currentX) ? 1 : -1;
        for (int i = currentX + step; i != x; i += step) {
            if (board.getAt(i, y) != null) {
                return false; 
            }
        }
    }
    Piece targetPiece = board.getAt(x, y);
    if (targetPiece != null && targetPiece.getColor().equals(this.getColor())) {
        return false; 
    }

    return true;
    }
}