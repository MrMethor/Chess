package sk.fri.chess.pieces;

import sk.fri.chess.Piece;
import sk.fri.chess.Square;

public class Rook implements Piece {

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
        return "Rook";
    }

    @Override
    public String symbol() {
        if (isWhite)
            return "R";
        else
            return "r";
    }

    @Override
    public boolean move(int column, int row) {
        if (this.column != column && this.row != row)
            return false;
        this.column = column;
        this.row = row;
        return true;
    }

    @Override
    public boolean isWhite() {
        return this.isWhite;
    }
}
