public class WithdrawalState extends ATMState{
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
        atm.setATMState(new SelectOperationState());
    }

    public void exit(){
        System.out.println("Remove your card!");
    }
}
