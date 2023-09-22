package sk.fri.chess.pieces;

import sk.fri.chess.Piece;
import sk.fri.chess.Square;

public class King implements Piece {

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
        return "King";
    }

    @Override
    public String symbol() {
        if (isWhite)
            return "K";
        else
            return "k";
    }

    @Override
    public boolean move(int column, int row) {
        return false;
    }

    @Override
    public boolean isWhite() {
        return this.isWhite;
    }
}