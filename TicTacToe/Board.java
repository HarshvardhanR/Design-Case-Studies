package TicTacToe;

public class Board {
    
    int size;
    PieceType board[][];

    public Board(int size){
        this.size = size;
        board = new PieceType[size][size];
    }

    public void printBoard(){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j]==null){
                    System.out.print(" " + " | ");
                    continue;
                }
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
