package TicTacToe;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Deque;

public class Game {
    Deque<Players> playerList;
    Board b;

    public Game(int size, String[] playerNames) {
        playerList = new LinkedList<>();
        PieceType ptArray[] = PieceType.values();
        for (int i = 0; i < playerNames.length; i++) {
            PieceType assignedPiece = ptArray[i % playerNames.length];
            playerList.add(new Players(playerNames[i], assignedPiece));
        }
        b = new Board(size);
        System.out.println();
        printPlayerPieceType(playerList);
        System.out.println();
        initializeGame();
    }

    public void initializeGame() {
        b.printBoard();
        try {
            startGame();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void startGame() throws PlaceOccupiedException {
        boolean winner = false;
        int count = 0;
        Scanner sc = new Scanner(System.in);

        while (!winner) {
            if (count == b.getBoard().length * b.getBoard().length) {
                System.out.println("Game Tied");
                return;
            }

            Players playerTurn = playerList.removeFirst();
            System.out.println(playerTurn.getName() + "'s turn (" + playerTurn.getPiece() + ")");
            System.out.println("Enter the position you want to place your piece in i,j format:");

            String[] pos = sc.nextLine().split(",");
            int row = Integer.parseInt(pos[0]);
            int col = Integer.parseInt(pos[1]);

            try {
                boolean placed = b.addPiece(playerTurn.getPiece(), row, col);
                if (!placed) {
                    throw new PlaceOccupiedException("Cell already occupied. Try again");
                }
            } catch (PlaceOccupiedException e) {
                System.out.println(e.getMessage());
                playerList.addFirst(playerTurn);
                continue;
            }

            if (b.checkWin(playerTurn.getPiece())) {
                System.out.println(playerTurn.getName() + " wins!");
                winner = true;
            } else {
                playerList.addLast(playerTurn);
            }
        }
    }

    public void printPlayerPieceType(Deque<Players> playerList) {
        Iterator<Players> it = playerList.iterator();
        while (it.hasNext()) {
            Players p = it.next();
            System.out.println("Assigned piece to player " + p.getName() + " is " + p.getPiece());
        }
    }

}
