package TicTacToe;

import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        System.out.println("Welcome to TicTacToe");
        System.out.println("To play the game minimum of two players are required");
        Scanner sc= new Scanner(System.in);
        String arr[];
        while(true){
            System.out.print("Enter player names (space-separated): ");
            arr = sc.nextLine().split(" ");
            try{
                validateMinPlayers(arr);
                break;
            }
            catch(NotEnoughPlayersException e){
                System.out.println("Caught Exception: " + e.getMessage());
            }
        }
        
        Game g = new Game(3, arr);
    }

    public static void validateMinPlayers(String[] arr) throws NotEnoughPlayersException{
        if(arr.length<2){
            throw new NotEnoughPlayersException("Minimum Players Condition not met");
        }
    }
}