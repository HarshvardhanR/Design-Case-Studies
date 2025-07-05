
public abstract class ATMState {
    protected ATM atm;

    public void insertCard(){
        System.out.println("Oops! Something went wrong");
    }

    public void authenticatePin(int number, Card card){
        System.out.println("Oops! Something went wrong");
    }

    public void selectOperation(OperationType type){
        System.out.println("Oops! Something went wrong");
    }

    public void withdrawAmount(int amount, Card card){
        System.out.println("Oops! Something went wrong");
    }

    public void checkBalance(Card card){
        System.out.println("Oops! Something went wrong");
    }

    public void exit(){
        System.out.println("Oops! Something went wrong");
    }
}
