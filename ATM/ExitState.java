public class ExitState extends ATMState{

    public ExitState(ATM atm){
        super(atm);
    }
    public void exit(){
        System.out.println("Remove your card!");
        atm.setATMState(new InsertCardState(atm));
    }
}
