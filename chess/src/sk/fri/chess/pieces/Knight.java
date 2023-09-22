package sk.fri.chess.pieces;

import sk.fri.chess.Piece;
import sk.fri.chess.Square;

public class Knight implements Piece {

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
        return "Knight";
    }

    @Override
    public String symbol() {
        if (isWhite)
            return "L";
        else
            return "l";
    }

    @Override
    public boolean move(int column, int row) {
        if ((column != this.column - 3 && column != this.column + 3) || (column != this.column - 1 && column != this.column + 1)
            || (row != this.row - 3 && row != this.row + 3) || (row != this.row - 1 && row != this.row + 1))
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