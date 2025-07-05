public class Card {
    int pin;
    BankAccount bankAccount;

    public int getPin(){
        return pin;
    }

    public int getAvailableBalance(){
        return bankAccount.getBalance();
    }

    public void setAvailableBalance(int amount){
        bankAccount.setBalance(amount);
    }
}
