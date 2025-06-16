package TicTacToe;

public class Board {

    int size;
    PieceType board[][];

    public Board(int size) {
        this.size = size;
        board = new PieceType[size][size];
    }

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == null) {
                    System.out.print(" " + " | ");
                    continue;
                }
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public boolean addPiece(PieceType p, int i, int j){
        if (board[i][j] != null) {
            return false;
        }
        board[i][j] = p;
        return true;
    }

    public PieceType[][] getBoard() {
        return board;
    }

    public boolean checkWin(PieceType piece) {
        PieceType[][] board = getBoard();
        int size = board.length;

        for (int i = 0; i < size; i++) {
            boolean rowWin = true;
            for (int j = 0; j < size; j++) {
                if (board[i][j] != piece) {
                    rowWin = false;
                    break;
                }
            }
            if (rowWin)
                return true;
        }

        for (int j = 0; j < size; j++) {
            boolean colWin = true;
            for (int i = 0; i < size; i++) {
                if (board[i][j] != piece) {
                    colWin = false;
                    break;
                }
            }
            if (colWin)
                return true;
        }

        boolean diagWin1 = true;
        for (int i = 0; i < size; i++) {
            if (board[i][i] != piece) {
                diagWin1 = false;
                break;
            }
        }
        if (diagWin1)
            return true;

        boolean diagWin2 = true;
        for (int i = 0; i < size; i++) {
            if (board[i][size - 1 - i] != piece) {
                diagWin2 = false;
                break;
            }
        }
        if (diagWin2)
            return true;

        return false;
    }

}
