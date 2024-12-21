public class Move {
    private int startX;
    private int endX;
    private int startY;
    private int endY;
    private Piece movedPiece;
    private Piece killedPiece;

    /**
     * Creates a new move with specified coordinates and moved piece.
     * @param startX Starting x-coordinate
     * @param startY Starting y-coordinate
     * @param endX Ending x-coordinate
     * @param endY Ending y-coordinate
     * @param movedPiece The piece being moved
     */
    public Move(int startX, int endX, int startY, int endY, Piece movedPiece) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.movedPiece = movedPiece;
        this.killedPiece = null;
    }

    /**
     * Creates a new move with specified coordinates and both moved and killed pieces.
     * @param startX Starting x-coordinate
     * @param startY Starting y-coordinate
     * @param endX Ending x-coordinate
     * @param endY Ending y-coordinate
     * @param movedPiece The piece being moved
     * @param killedPiece The piece being captured
     */
    public Move(int startX, int endX, int startY, int endY, Piece movedPiece, Piece killedPiece) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.movedPiece = movedPiece;
        this.killedPiece = killedPiece;
    }

    /**
     * Returns a string representation of the move.
     * @return String describing the move
     */
    public String toString() {
    
        char column = (char) ('a' + this.endX - 1);
    
        String symbol = this.movedPiece.getSymbol();
    
        String color = this.movedPiece.getColor();
    
        return String.format("%s-%s%c%d", color, symbol, column, this.endY);
    }

   
    /**
     * ht.
     * @return
     */
    public int getStartX() { 
        return this.startX;
    }

    /**
     *  ht.
     * @param startX 1
     */
    public void setStartX(int startX) {
        this.startX = startX;
    }

    /**
     * ht.
     * @return
     */
    public int getEndX() {
         return this.endX; 
    }

    /**
     * ht.
     */
    public void setEndX(int endX) {
        this.endX = endX;
    }

    /**
     * ht.
     * @return
     */
    public int getStartY() {
        return this.startY;
    }

    /**
     * ht.
     * @param startY 1
     */
    public void setStartY(int startY) { 
        this.startY = startY;
    }

    /**
     * ht.
     * @return 1
     */
    public int getEndY() {
        return this.endY;
    }

    /**
     * ht.
     * @param endY 1
     */
    public void setEndY(int endY) {
        this.endY = endY;
    }

    /**
     * ht.
     * @return
     */
    public Piece getMovedPiece() {
        return this.movedPiece;
    }

    /**
     * ht.
     * @param movedPiece 1
     */
    public void setMovedPiece(Piece movedPiece) {
        this.movedPiece = movedPiece;
    }

    /**
     * ht.
     * @return
     */
    public Piece getKilledPiece() {
        return this.killedPiece;
    }

    /**
     * ht.
     * @param killedPiece 1
     */
    public void setKilledPiece(Piece killedPiece) {
        this.killedPiece = killedPiece;
    }
}