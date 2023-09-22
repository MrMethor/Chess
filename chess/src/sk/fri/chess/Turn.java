package sk.fri.chess;

import java.util.Scanner;

public class Turn {

    private Square[][] squares;
    private boolean whiteTurn = true;
    private Square chosenSquare = null;
    private final Scanner scanner;

    public Turn(Square[][] squares) {
        this.squares = squares;
        this.scanner = new Scanner(System.in);
    }

    public void turn() {
        String command = this.scanner.next();
        doAction(command.charAt(0), command.charAt(1));
    }

    public void doAction(char column, char row) {
        Square square = this.squares[number(column)][number(row)];
        if (square.hasPiece()){
            if (square.getPiece().isWhite() != this.whiteTurn && this.chosenSquare != null)
                tryMove(column, row);
            else{
                this.chosenSquare = square;
                System.out.printf("You chose a %s on the square %c%c%n", square.getPiece().name(), column, row);
            }
        }
        else
            tryMove(column, row);
    }

    private void tryMove(char column, char row) {
        if (this.chosenSquare.hasPiece() && this.chosenSquare.getPiece().move(number(column), number(row))) {
            this.squares[number(column)][number(row)].addPiece(this.chosenSquare.getPiece());
            this.chosenSquare.removePiece();
            this.chosenSquare = null;
            this.whiteTurn = !whiteTurn;
        }
    }

    private int number(char ch){
        return Coords.getNumber(ch);
    }

    public boolean getTurn() {
        return this.whiteTurn;
    }
}
