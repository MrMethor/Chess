package sk.fri.chess;
public class Coords {
    static public int getNumber(char ch){
        return switch (ch) {
            case '1', 'a' -> 0;
            case '2', 'b' -> 1;
            case '3', 'c' -> 2;
            case '4', 'd' -> 3;
            case '5', 'e' -> 4;
            case '6', 'f' -> 5;
            case '7', 'g' -> 6;
            case '8', 'h' -> 7;
            default -> 9;
        };
    }

    static public char getCharacter(int i, boolean isColumn){
        if (isColumn) {
            return switch (i) {
                case 0 -> 'a';
                case 1 -> 'b';
                case 2 -> 'c';
                case 3 -> 'd';
                case 4 -> 'e';
                case 5 -> 'f';
                case 6 -> 'g';
                case 7 -> 'h';
                default -> '-';
            };
        }
        else {
            return switch (i) {
                case 0 -> '1';
                case 1 -> '2';
                case 2 -> '3';
                case 3 -> '4';
                case 4 -> '5';
                case 5 -> '6';
                case 6 -> '7';
                case 7 -> '8';
                default -> '-';
            };
        }
    }
}
