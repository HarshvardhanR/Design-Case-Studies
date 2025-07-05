public class SelectOperationState extends ATMState {
    OperationType type;

    public void selectOperation(OperationType type){
        if(type==OperationType.WITHDRAWAL){
            atm.setATMState(new WithdrawalState());
        }
        else if(type==OperationType.CHECK_BALANCE){
            atm.setATMState(new CheckBalanceState());
        }
        else{
            System.out.println("Not the valid option");
        }
    }
}
