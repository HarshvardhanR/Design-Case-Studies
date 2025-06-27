public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;

    public abstract void prepare();

    public void bake(){
        System.out.println("Baking at 425");
    }

    public void box(){
        System.out.println("cutting diagonally and boxing");
    }

    public String getName(){
        return name;
    }
}

class NyStyleCheesePizza extends Pizza{

    PizzaIngredients piz;
    
    public NyStyleCheesePizza(PizzaIngredients piz){
        name = "New York Style Cheese Pizza";
        this.piz = piz;
    }

    public void prepare(){
        System.out.println("Preparing Dough " + piz.createDough());
        System.out.println("Preparing Sauce " + piz.createSauce());
    }
}

class ChicagoStyleCheesePizza extends Pizza{

    PizzaIngredients piz;
    
    public ChicagoStyleCheesePizza(PizzaIngredients piz){
        name = "Chicago Style Cheese Pizza";
        this.piz = piz;
    }

    public void prepare(){
        System.out.println("Preparing Dough " + piz.createDough());
        System.out.println("Preparing Sauce " + piz.createSauce());
    }
}