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

    public void setCurrentPosition(int currentPostion){
        this.currentPostion = currentPostion;
    }

    public int getID(){
        return id;
    }
}
