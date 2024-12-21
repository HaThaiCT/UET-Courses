import java.util.ArrayList;

/**
 * Represents the chess board and manages piece placement and movement.
 */
public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;
    private ArrayList<Piece> pieces = new ArrayList<>();

    /**
     * Creates a new chess board with default setup.
     */
    public Board() {
        pieces = new ArrayList<>();
    }

    /**
     * Adds a piece to the board.
     * @param piece The piece to add
     */
    public void addPiece(Piece piece) {
        if (validate(piece.getCoordinatesX(), piece.getCoordinatesY())) {
            for (Piece p : pieces) {
                if (p.getCoordinatesX() == piece.getCoordinatesX() 
                && p.getCoordinatesY() == piece.getCoordinatesY()) {
                    return;
                }
            }
            pieces.add(piece);
        }
    }

    /**
     * Validates if the given coordinates are within the board boundaries.
     * @param x The x-coordinate
     * @param y The y-coordinate
     * @return true if coordinates are valid, false otherwise
     */
    public boolean validate(int x, int y) {
        return (x <= WIDTH && y <= HEIGHT && x >= 1 && y >= 1);
    }

    /**
     * Removes a piece at the specified coordinates.
     * @param x The x-coordinate
     * @param y The y-coordinate
     */
    public void removeAt(int x, int y) {
        if (pieces.isEmpty()) {
            return;
        }
        for (Piece piece : pieces) {
            if (piece.getCoordinatesX() == x && piece.getCoordinatesY() == y) {
                pieces.remove(piece);
                return;
            }
        }        
    }

    /**
     * Gets the piece at the specified coordinates.
     * @param x The x-coordinate
     * @param y The y-coordinate
     * @return The piece at the specified position, or null if empty
     */
    public Piece getAt(int x, int y) {
        for (Piece piece : pieces) {
            if (piece.getCoordinatesX() == x && piece.getCoordinatesY() == y) {
               return piece; 
            }
        }
        return null;
    }

    /**
     * Gets all pieces currently on the board.
     * @return List of all pieces
     */
    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    /**
     * Sets the pieces on the board.
     * @param pieces List of pieces to set
     */
    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }
}