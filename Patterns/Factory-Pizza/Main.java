public class Main{
    public static void main(String args[]){
        PizzaStore ny = new NyStore();
        PizzaStore chicago = new ChicagoStore();
        Pizza nyCheese = ny.orderPizza("Cheese");
        System.out.println("Ethan ordered " + nyCheese.getName());
        System.out.println();
        Pizza chicagoVeggie = chicago.orderPizza("Veggie");
        System.out.println("Sanaya ordered " + chicagoVeggie.getName());
    }
}