package SnakeLadder;

import java.util.Random;

public class Board {
    private Cell[][] cells;

    public Board(int size, int numberOfSnakes, int numberOfLadders) {
        initializeBoard(size);
        addSnakesAndLadders(numberOfSnakes, numberOfLadders);
    }

    private void initializeBoard(int size) {
        cells = new Cell[size][size];  // FIXED: initialize the 2D array
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    private void addSnakesAndLadders(int numberOfSnakes, int numberOfLadders) {
        Random rand = new Random();
        int max = getSize();

        while (numberOfSnakes > 0) {
            int start = rand.nextInt(max);
            int end = rand.nextInt(max);
            if (start <= end) continue;

            Cell cell = getCell(start);
            if (cell.getProp() != null) continue;

            Prop snake = new Prop(start, end);
            cell.setProp(snake);
            numberOfSnakes--;
        }

        while (numberOfLadders > 0) {
            int start = rand.nextInt(max);
            int end = rand.nextInt(max);
            if (start >= end) continue;

            Cell cell = getCell(start);
            if (cell.getProp() != null) continue;

            Prop ladder = new Prop(start, end);
            cell.setProp(ladder);
            numberOfLadders--;
        }
    }

    public Cell getCell(int position) {
        int size = cells.length;
        int row = position / size;
        int col = position % size;
        return cells[row][col];
    }

    public int getSize() {
        return cells.length * cells.length;
    }
}
