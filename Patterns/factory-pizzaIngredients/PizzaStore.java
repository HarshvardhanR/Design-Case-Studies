public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.box();

        return pizza;
    }

    public abstract Pizza createPizza(String type);
}

class NyStore extends PizzaStore{

    PizzaIngredients piz = new NyStyleIngredients();
    public Pizza createPizza(String type){
        if(type.equals("cheese")){
            return new NyStyleCheesePizza(piz);
        }
        return null;
    }
}


class ChicagoStore extends PizzaStore{

    PizzaIngredients piz = new ChicagoStyleIngredients();
    public Pizza createPizza(String type){
        if(type.equals("cheese")){
            return new ChicagoStyleCheesePizza(piz);
        }
        return null;
    }
}