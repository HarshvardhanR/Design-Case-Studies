public class Main{
    public static void main(String args[]){
        PizzaStore ny = new NyStore();
        PizzaStore chic = new ChicagoStore();

        Pizza nypiz = ny.orderPizza("cheese");
        System.out.println("Pizza prepared: " + nypiz.getName());
        System.out.println();

        Pizza chicpiz = chic.orderPizza("cheese");
        System.out.println("Pizza prepared: " + chicpiz.getName());
    }
}