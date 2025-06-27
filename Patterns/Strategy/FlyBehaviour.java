public interface FlyBehaviour {
    public void fly();
}

class FlyWithWings implements FlyBehaviour{
    public void fly(){
        System.out.println("flying with wings");
    }
}

class noFlying implements FlyBehaviour{
    public void fly(){
        System.out.println("I can't fly");
    }
}