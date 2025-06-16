package TicTacToe;
class NotEnoughPlayersException extends Exception{
    public NotEnoughPlayersException(String message){
        super(message);
    }
}