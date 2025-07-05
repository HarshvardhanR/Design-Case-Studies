public class InsertCardState extends ATMState{
    public void insertCard(){
        System.out.println("Card is inserted");
        atm.setATMState(new AuthenticatePinState());
    }
}
