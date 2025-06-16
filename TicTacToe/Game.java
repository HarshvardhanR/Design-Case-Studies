package TicTacToe;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Game {
    Queue<Players> playerList;
    Board b;

    public Game(int size, String[] playerNames){
        playerList = new LinkedList<>();
        PieceType ptArray[] = PieceType.values();
        for(int i=0; i<playerNames.length; i++){
            PieceType assignedPiece = ptArray[i % playerNames.length];
            playerList.add(new Players(playerNames[i], assignedPiece));
        }
        b = new Board(size);
        System.out.println();
        printPlayerPieceType(playerList);
        System.out.println();
        initializeGame();
    }

    public void initializeGame(){
        b.printBoard();
    }

    public void printPlayerPieceType(Queue<Players> playerList){
        Iterator<Players> it = playerList.iterator();
        while(it.hasNext()){
            Players p = it.next();
            System.out.println("Assigned piece to player " + p.getName() + " is " + p.getPiece());
        }
    }

}
