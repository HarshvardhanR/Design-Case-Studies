public class CheckBalanceState extends ATMState{

    public CheckBalanceState(ATM atm){
        super(atm);
    }
    public void checkBalance(Card card){
        System.out.println("Current balance is: " + card.getAvailableBalance());
        atm.setATMState(new SelectOperationState(atm));
    }

    public void exit(){
        System.out.println("Remove your card!");
        atm.setATMState(new InsertCardState(atm));
    }
}
