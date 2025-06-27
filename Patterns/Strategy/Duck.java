public abstract class Duck {
    abstract void display();

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void performQuack(){
        quackBehaviour.quack();
    }
    public void flyBehaviour(){
        flyBehaviour.fly();
    }
    public void setFlyBehaviour(FlyBehaviour fb){
        flyBehaviour = fb;
    }
    public void setPerformQuack(QuackBehaviour qb){
        quackBehaviour = qb;
    }
}

class MallardDuck extends Duck{
    public void display(){
        System.out.println("This is Mallard Duck");
    }

    public MallardDuck(){
    }
}