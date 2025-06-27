import java.util.ArrayList;

public abstract class Pizza{
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    public void prepare(){
        System.out.println("preparing the pizza ");
        System.out.println("Tossing the dough");
        System.out.println("adding the sauce");
        System.out.print("Adding the toppings: ");
        for(int i=0; i<toppings.size(); i++){
            System.out.print(toppings.get(i) + " ");
        }
        System.out.println();
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
        
    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
       
    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
        
    public String getName() {
        return name;
    }
}

class NyStyleCheesePizza extends Pizza{
    public NyStyleCheesePizza(){
        name = "New York Style Cheese Pizza";
        dough = "Slim Dough";
        sauce = "Liquid Tomato Sauce";
        toppings.add("Grated Parmesan Cheese");

    }
}

class NyStyleVeggiePizza extends Pizza{
    public NyStyleVeggiePizza(){
        name = "New York Style Veggie Pizza";
        dough = "Slim Dough";
        sauce = "Liquid Tomato Sauce";
    }
}

class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza(){
        name = "Chicago Style Cheese Pizza";
        dough = "Thick Dough";
        sauce = "Rich Tomato Sauce";
        toppings.add("Grated Parmesan Cheese");
    }
}

class ChicagoStyleVeggiePizza extends Pizza{
    public ChicagoStyleVeggiePizza(){
        name = "Chicago Style veggie Pizza";
        dough = "Thick Dough";
        sauce = "Rich Tomato Sauce";
        toppings.add("Adding Basil Leaves");
    }
}