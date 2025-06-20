package SnakeLadder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Deque<Player> playerList;
    Board board;
    Dice dice;
    Player winner;

    public Game(int playerCount, int size, int diceCount, int nOfS, int nOfL) {
        playerList = new LinkedList<>();
        for (int i = 0; i < playerCount; i++) {
            playerList.offer(new Player(i + 1, 0));
        }
        dice = new Dice(diceCount);
        board = new Board(size, nOfS, nOfL);
        winner = null;
        startGame();
    }

    public void startGame() {
        while (winner == null) {
            Player playerTurn = findPlayer();
            System.out.println(
                    "Player Id: " + playerTurn.getID() + " Current Position: " + playerTurn.getCurrentPosition());

            int diceNumber = dice.rollDice();
            System.out.println("Rolled Number is: " + diceNumber);

            int position = checkValidity(diceNumber, playerTurn.getCurrentPosition());
            playerTurn.setCurrentPosition(position);

            System.out
                    .println("Player Id: " + playerTurn.getID() + " New Position: " + playerTurn.getCurrentPosition());

            System.out.println("----------------------------------------------");

            if (playerTurn.getCurrentPosition() == board.getSize() - 1) {
                winner = playerTurn;
                System.out.println("Winner is Player " + playerTurn.getID());
            }
        }
    }

    public Player findPlayer() {
        Player playerTurn = playerList.pop();
        playerList.offer(playerTurn);
        return playerTurn;
    }

    public int checkValidity(int diceNumber, int currentPosition) {
        int newPosition = currentPosition + diceNumber;

        if (newPosition >= board.getSize())
            return currentPosition;

        Cell cell = board.getCell(newPosition);
        if (cell.getProp() != null && cell.getProp().getStart() == newPosition) {
            String propType = (cell.getProp().getStart() > cell.getProp().getEnd()) ? "Snake Encountered"
                    : "Ladder Encountered";
            System.out.println(propType);
            return cell.getProp().getEnd();
        }
        return newPosition;
    }

}
