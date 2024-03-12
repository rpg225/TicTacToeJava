public class TicTacToe {
    public static void main (String[] args) {
        // Todo auto generated methods stub
        char [] [] gameBoard = {{}, {}, {}, {}, {}};
        for (char[] row : gameBoard) {
            for(char c : row) {
                System.out.print(c);
            }
        }
    }
}