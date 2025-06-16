package TicTacToe;
class NotEnoughPlayersException extends Exception{
    public NotEnoughPlayersException(String message){
        super(message);
    }
}

class PlaceOccupiedException extends Exception{
    public PlaceOccupiedException(String message){
        super(message);
    }
}
