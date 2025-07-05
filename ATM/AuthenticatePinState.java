public class AuthenticatePinState extends ATMState{
    public void authenticatePin(int number, Card card){
        if(card.getPin()==number){
            System.out.println("Authenticated Successfully");
            atm.setATMState(new SelectOperationState());
            return;
        }
        System.out.println("Wrong Pin. Try again");
    }
}
