public class Main {
    public static void main(String[] args) {
       ATM atm = new ATM();
       Card card = new Card();
       atm.setCard(card);
       atm.insertCard();
       atm.authenticatePin(1234);
       atm.selectOperation(OperationType.WITHDRAWAL);
       atm.withdrawAmount(1000);
       System.out.println("Amount in ATM: " + atm.getMoney());
       atm.selectOperation(OperationType.CHECK_BALANCE);
       atm.checkBalance();
       atm.exit();
       System.out.println(atm.getState());
    }   
}
