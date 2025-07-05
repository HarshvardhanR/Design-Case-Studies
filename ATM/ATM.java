public class ATM {
    ATMState state;
    int money;
    Card card;

    public ATM(){
        state = new InsertCardState(this);
        money = 4000;
        card = null;
    }

    public void setCard(Card card){
        this.card = card;
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

    public void insertCard(){
        state.insertCard();
    }

    public void authenticatePin(int pin){
        state.authenticatePin(pin, card);
    }

    public void selectOperation(OperationType type){
        state.selectOperation(type);
    }

    public void withdrawAmount(int amount){
        state.withdrawAmount(amount, card);
    }

    public void checkBalance(){
        state.checkBalance(card);
    }

    public void exit(){
        state.exit();
    }

    public ATMState getState(){
        return state;
    }
}
