abstract class ConcreteDecorator extends Beverage{
    abstract public String getDescription();
}


class Mocha extends ConcreteDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Mocha";
    }

    public double cost(){
        return beverage.cost() + 0.20; 
    }
}