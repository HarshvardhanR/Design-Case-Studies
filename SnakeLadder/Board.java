package SnakeLadder;

import java.util.Random;
public class Board {
    Cell [][] cells;

    public Board(int size, int numberOfSnakes, int numberOfLadders){
        initializeBoard(size);
        addSnakesAndLadders(numberOfSnakes,numberOfLadders, cells);
    }

    public void initializeBoard(int size){
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                cells[i][j] = new Cell();
            }
        }
    }

    public void addSnakesAndLadders(int numberOfSnakes, int numberOfLadders, Cell[][] cells){
        Random rand = new Random();
        while(numberOfSnakes>0){
            int start = rand.nextInt(96 - 15 + 1) + 15;
            int end = rand.nextInt(96 - 15 + 1) + 15;
            if(start>=end) continue;
            Cell cell = getCell(start);
            if(cell.getProp()!=null) continue;
            Prop snake = new Prop(start, end);
        }
    }

    public Cell getCell(int start){
        int row = start/cells.length;
        int col = start % cells.length;
        return cells[row][col];
    }
}
