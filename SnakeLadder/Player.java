package SnakeLadder;

public class Player {
    int currentPostion;
    int id;

    public Player(int id, int currentPostion){
        this.id = id;
        this.currentPostion = currentPostion;
    }

    public int getCurrentPosition(){
        return currentPostion;
    }

    public int getID(){
        return id;
    }
}
