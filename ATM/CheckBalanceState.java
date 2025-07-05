public class CheckBalanceState extends ATMState{
    public void checkBalance(Card card){
        System.out.println("Current balance is" + card.getAvailableBalance());
        atm.setATMState(new SelectOperationState());
    }

    public void exit(){
        System.out.println("Remove your card!");
    }
}
