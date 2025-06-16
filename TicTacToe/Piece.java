package TicTacToe;

public class Piece {
    protected PieceType pt;

    public Piece(PieceType pt){
        this.pt = pt;
    }
}

class PieceX extends Piece{
    public PieceX(){
        super(PieceType.X);
    }
}

class PieceO extends Piece{
    public PieceO(){
        super(PieceType.O);
    }
}