package TicTacToe;

public class Players {
    protected String name;
    protected PieceType p;
    
    public Players(String name, PieceType p){
        this.name = name;
        this.p = p;
    }

    public PieceType getPiece(){
        return p;
    }

    public String getName(){
        return name;
    }
}
