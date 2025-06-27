public interface PizzaIngredients {
    public Dough createDough();
    public Sauce createSauce();
}

class NyStyleIngredients implements PizzaIngredients{
    public Dough createDough(){
        return new ThinCrustDough();
    }
    public Sauce createSauce(){
        return new LightMarinaraSauce();
    }
}

class ChicagoStyleIngredients implements PizzaIngredients{
    public Dough createDough(){
        return new ThickCrustDough();
    }
    public Sauce createSauce(){
        return new RichMarinaraSauce();
    }
}

// Dough interface
interface Dough {
    String getDescription();
}

// Sauce interface
interface Sauce {
    String getDescription();
}

// Concrete Dough Classes
class ThinCrustDough implements Dough {
    @Override
    public String getDescription() {
        return "Thin Crust Dough";
    }
}

class ThickCrustDough implements Dough {
    @Override
    public String getDescription() {
        return "Thick Crust Dough";
    }
}

// Concrete Sauce Classes
class LightMarinaraSauce implements Sauce {
    @Override
    public String getDescription() {
        return "Light Marinara Sauce";
    }
}

class RichMarinaraSauce implements Sauce {
    @Override
    public String getDescription() {
        return "Rich Marinara Sauce";
    }
}