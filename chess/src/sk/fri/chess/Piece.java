package sk.fri.chess;

public interface Piece {

    void initialize(Square square, boolean isWhite);

    String name();

    String symbol();

    boolean move(int x, int y);

    boolean isWhite();

}
