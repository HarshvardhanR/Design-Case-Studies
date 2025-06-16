package TicTacToe;

public class Board {
    int size;
    int board[][];

    public Board(int size){
        this.size = size;
        board = new int[size][size];
    }

}
