package sk.fri.chess;

public class Board {

    private final Square[][] squares;

    public Board() {
        this.squares = new Square[8][8];
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++)
                this.squares[j][i] = new Square(j, i);
        new BoardInicializer(this.squares);
    }

    public void drawBoard() {
        for (int i = 7; i > -1; i--) {
            System.out.print(Coords.getCharacter(i, false) + "  |  ");
            for (int j = 0; j < 8; j++){
                if(this.squares[j][i].hasPiece())
                    System.out.print(this.squares[j][i].getPiece().symbol());
                else{
                    if (this.squares[j][i].isWhite())
                        System.out.print("-");
                    else
                        System.out.print("=");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("    ------------------------");
        System.out.print("      ");
        for (int j = 0; j < 8; j++)
            System.out.print(Coords.getCharacter(j, true) + "  ");
        System.out.println();
    }

    public Square[][] getSquares() {
        return this.squares;
    }
}
