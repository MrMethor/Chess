package sk.fri.chess;

public class Square {

    private final boolean isWhite;
    private final int column;
    private final int row;
    private Piece currentPiece;

    public Square(int column, int row) {
        this.column = column;
        this.row = row;
        this.isWhite = (column + row) % 2 != 0;
    }

    public void addPiece(Piece piece) {
        if (this.currentPiece == null)
            this.currentPiece = piece;
    }

    public void removePiece(){
        this.currentPiece = null;
    }

    // Getters
    public int getColumn(){
        return this.column;
    }

    public int getRow(){
        return this.row;
    }

    public Piece getPiece() {
        return this.currentPiece;
    }

    public boolean hasPiece(){
        return this.currentPiece != null;
    }

    public boolean isWhite(){
        return this.isWhite;
    }
}
