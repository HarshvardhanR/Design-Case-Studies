public class Main {
    public static void main(String args[]){
        Duck duck = new MallardDuck();
        duck.setFlyBehaviour(new noFlying());
        duck.setPerformQuack(new Quack());
        duck.performQuack();
        duck.flyBehaviour();
    }
}
