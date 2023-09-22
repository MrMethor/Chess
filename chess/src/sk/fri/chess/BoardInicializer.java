package sk.fri.chess;

import sk.fri.chess.pieces.*;

public class BoardInicializer {

    private Square[][] squares;

    public BoardInicializer(Square[][] squares){
        this.squares = squares;
        /*
            addPiece - Piece, Column, Row, isWhite
            addRow   - Piece, Row, isWhite
            8 ██ ░░ ██ ░░ ██ ░░ ██ ░░
            7 ░░ ██ ░░ ██ ░░ ██ ░░ ██
            6 ██ ░░ ██ ░░ ██ ░░ ██ ░░
            5 ░░ ██ ░░ ██ ░░ ██ ░░ ██
            4 ██ ░░ ██ ░░ ██ ░░ ██ ░░
            3 ░░ ██ ░░ ██ ░░ ██ ░░ ██
            2 ██ ░░ ██ ░░ ██ ░░ ██ ░░
            1 ░░ ██ ░░ ██ ░░ ██ ░░ ██
              a  b  c  d  e  c  f  h
         */
        addPiece(new Rook(),'a', '1', true);
        addPiece(new Knight(), 'b', '1', true);
        addPiece(new Bishop(), 'c', '1', true);
        addPiece(new Queen(), 'd', '1', true);
        addPiece(new King(), 'e', '1', true);
        addPiece(new Bishop(), 'f', '1', true);
        addPiece(new Knight(), 'g', '1', true);
        addPiece(new Rook(), 'h', '1', true);

        addRow(new Pawn(), '2', true);

        addPiece(new Rook(),'a', '8', false);
        addPiece(new Knight(), 'b', '8', false);
        addPiece(new Bishop(), 'c', '8', false);
        addPiece(new Queen(), 'd', '8', false);
        addPiece(new King(), 'e', '8', false);
        addPiece(new Bishop(), 'f', '8', false);
        addPiece(new Knight(), 'g', '8', false);
        addPiece(new Rook(), 'h', '8', false);

        addRow(new Pawn(), '7', false);
    }

    private void addPiece(Piece piece, char column, char row, boolean isWhite) {
        this.squares[number(column)][number(row)].addPiece(piece);
        piece.initialize(this.squares[number(column)][number(row)], isWhite);
    }

    private void addPiece(Piece piece, int column, int row, boolean isWhite) {
        this.squares[column][row].addPiece(piece);
        piece.initialize(this.squares[column][row], isWhite);
    }

    private void addRow(Piece piece, char row, boolean isWhite){
        for(int i = 0; i < squares.length; i++)
            addPiece(piece, i, number(row), isWhite);
    }

    private int number(char ch){
        return Coords.getNumber(ch);
    }
}
