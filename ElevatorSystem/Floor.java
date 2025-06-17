package ElevatorSystem;

public class Floor {
    private final int number;
    private final ExternalButton b;
    public Floor(int number){
        this.number = number;
        this.b = new ExternalButton();
    }

    public int getFloorNumber(){
        return number;
    }

    public void pressButton(Direction dir, ExternalButton b){
        
    }
}
