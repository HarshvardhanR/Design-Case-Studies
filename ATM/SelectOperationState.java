public class SelectOperationState extends ATMState {

    public SelectOperationState(ATM atm){
        super(atm);
    }

    OperationType type;

    public void selectOperation(OperationType type){
        if(type==OperationType.WITHDRAWAL){
            atm.setATMState(new WithdrawalState(atm));
        }
        else if(type==OperationType.CHECK_BALANCE){
            atm.setATMState(new CheckBalanceState(atm));
        }
        else{
            System.out.println("Not the valid option");
        }
    }

    public void exit(){
        System.out.println("Remove your card!");
        atm.setATMState(new InsertCardState(atm));
    }

}
