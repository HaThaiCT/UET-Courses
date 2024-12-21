import java.util.ArrayList;

/**
 * Represents a chess game, managing the board and move history.
 */
public class Game {
    private Board board;
    private ArrayList<Move> moveHistory = new ArrayList<>();

    /**
     * Creates a new game with the specified board.
     * @param board The game board
     */
    public Game(Board board) {
        this.board = board;
    }

    /**
     * Moves a piece to the specified coordinates.
     * @param piece The piece to move
     * @param x The target x-coordinate
     * @param y The target y-coordinate
     */
    public void movePiece(Piece piece, int x, int y) {
        if (piece.canMove(board, x, y)) {
            Piece target = board.getAt(x, y);
            Move move;
            if (target != null) {
                move = new Move(piece.getCoordinatesX(), x, 
                piece.getCoordinatesY(), y, piece, target);
                board.removeAt(x, y);
            } else {
                move = new Move(piece.getCoordinatesX(), x, piece.getCoordinatesY(), y, piece);
            }
            piece.setCoordinatesX(x);
            piece.setCoordinatesY(y);
            moveHistory.add(move);
        }
    }

    /**
     * Gets the current game board.
     * @return The game board
     */
    public Board getBoard() {
        return this.board;
    }

    /**
     * Sets a new game board.
     * @param board The new game board
     */
    public void setBoard(Board board) {
        this.board = board;
    }

    /**
     * Gets the history of moves made in the game.
     * @return List of moves
     */
    public ArrayList<Move> getMoveHistory() {
        return this.moveHistory;
    }
}