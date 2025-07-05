public class WithdrawalState extends ATMState{

    public WithdrawalState(ATM atm){
        super(atm);
    }
    public void withdrawAmount(int amount, Card card){
        if(amount > card.getAvailableBalance()){
            System.out.println("Not enough balace");
        }
        else if(amount > atm.getMoney()){
            System.out.println("Not enough money in ATM");
        }
        else{
            int currCardBalance = card.getAvailableBalance();
            currCardBalance = currCardBalance - amount;
            card.setAvailableBalance(currCardBalance);
            int currMoneyinATM = atm.getMoney();
            currMoneyinATM = currMoneyinATM - amount;
            atm.setMoney(currMoneyinATM);
        }
        atm.setATMState(new SelectOperationState(atm));
    }

    public void exit(){
        System.out.println("Remove your card!");
        atm.setATMState(new InsertCardState(atm));
    }
}
