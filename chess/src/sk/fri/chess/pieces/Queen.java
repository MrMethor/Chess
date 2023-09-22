package sk.fri.chess.pieces;

import sk.fri.chess.Piece;
import sk.fri.chess.Square;

public class Queen implements Piece {

    private boolean isWhite;
    private int column;
    private int row;

    @Override
    public void initialize(Square square, boolean isWhite) {
        this.column = square.getColumn();
        this.row = square.getRow();
        this.isWhite = isWhite;
    }

    @Override
    public String name() {
        return "Queen";
    }

    @Override
    public String symbol() {
        if (isWhite)
            return "Q";
        else
            return "q";
    }

    @Override
    public boolean move(int column, int row) {
        for (int i = 1; i < 8; i++) {
            if ((this.column + i == column && this.row + i == row) || (this.column + i == column && this.row - i == row)
                    || (this.column - i == column && this.row + i == row) || (this.column - i == column && this.row - i == row)) {
                this.column = column;
                this.row = row;
                return true;
            }
            else if (this.column == column || this.row == row){
                this.column = column;
                this.row = row;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isWhite() {
        return this.isWhite;
    }
}
