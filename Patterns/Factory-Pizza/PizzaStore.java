public abstract class PizzaStore {
    
    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract Pizza createPizza(String type);
}

class NyStore extends PizzaStore{
    public Pizza createPizza(String type){
        if(type.equals("Cheese")){
            return new NyStyleCheesePizza();
        }
        else if(type.equals("Veggie")){
            return new NyStyleVeggiePizza();
        }
        return null;
    }
}

class ChicagoStore extends PizzaStore{
    public Pizza createPizza(String type){
        if(type.equals("Cheese")){
            return new ChicagoStyleCheesePizza();
        }
        else if(type.equals("Veggie")){
            return new ChicagoStyleVeggiePizza();
        }
        return null;
    }
}