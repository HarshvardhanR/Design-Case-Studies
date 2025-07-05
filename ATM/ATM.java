public class ATM {
    ATMState state;
    int money;

    public ATM(){
        state = new InsertCardState();
        money = 4000;
    }
    
    public void setMoney(int money){
        this.money = money;
    }

    public int getMoney(){
        return money;
    }

    public void setATMState(ATMState state){
        this.state = state;
    }
}
