package SnakeLadder;

import java.util.Random;

public class Dice {
    int diceCount;
    int min = 1;
    int max = 6;
    Random rand;
    
    public Dice(int diceCount){
        this.diceCount = diceCount;
        rand = new Random();
    }

    public int rollDice(){
        int accumulatedNumber= 0;
        int diceUsed = 0;
        while(diceUsed<diceCount){
            accumulatedNumber += rand.nextInt(max - min + 1) + min;
        }
        return accumulatedNumber;
    }
}
