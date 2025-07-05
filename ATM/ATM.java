public class ATM {
    ATMState state;
    int money;

    public void setMoney(int money){
        this.money = money;
    }

    public int getMoney(){
        return money;
    }

    public ATM(){
        state = new InsertCardState();
    }
    public void setATMState(ATMState state){
        this.state = state;
    }
}
