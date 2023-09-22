package sk.fri.chess;

public class Game {

    private Board board;
    private Turn turn;

    public Game() {
        this.board = new Board();
        this.turn = new Turn(this.board.getSquares());
        while(true){
            this.board.drawBoard();
            this.turn.turn();
        }
    }
}
