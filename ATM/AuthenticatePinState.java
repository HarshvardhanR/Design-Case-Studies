public class AuthenticatePinState extends ATMState{

    public AuthenticatePinState(ATM atm){
        super(atm);
    }
    public void authenticatePin(int number, Card card){
        if(card.getPin()==number){
            System.out.println("Authenticated Successfully");
            atm.setATMState(new SelectOperationState(atm));
            return;
        }
        System.out.println("Wrong Pin. Try again");
    }
}
