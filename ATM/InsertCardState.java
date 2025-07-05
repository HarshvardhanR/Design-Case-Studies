public class InsertCardState extends ATMState{
    public InsertCardState(ATM atm){
        super(atm);
    }
    public void insertCard(){
        System.out.println("Card is inserted");
        atm.setATMState(new AuthenticatePinState(atm));
    }
}
