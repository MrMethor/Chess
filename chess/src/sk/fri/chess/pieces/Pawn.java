package sk.fri.chess.pieces;

import sk.fri.chess.Piece;
import sk.fri.chess.Square;

public class Pawn implements Piece {

    private boolean isWhite;
    private int column;
    private int row;
    private boolean moved = false;

    @Override
    public void initialize(Square square, boolean isWhite) {
        this.column = square.getColumn();
        this.row = square.getRow();
        this.isWhite = isWhite;
    }

    @Override
    public String name() {
        return "Pawn";
    }

    @Override
    public String symbol() {
        if (isWhite)
            return "P";
        else
            return "p";
    }

    @Override
    public boolean move(int column, int row) {
        if (row == this.row - 1) {
            this.row = row;
            this.moved = true;
            return true;
        }
        else if (row == this.row - 2 && !this.moved) {
            this.row = row;
            this.moved = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean isWhite() {
        return this.isWhite;
    }
}