public interface QuackBehaviour {
    public void quack();
}

class Quack implements QuackBehaviour{
    public void quack(){
        System.out.println("Quacking");
    }
}