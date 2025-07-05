public class Card {
    int pin;
    BankAccount bankAccount;

    public Card(){
        pin = 1234;
        bankAccount = new BankAccount(5000);
    }

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
