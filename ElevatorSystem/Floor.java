package ElevatorSystem;

public class Floor {
    private final int number;
    private final ExternalButton b1;
    private final ExternalButton b2;
    public Floor(int number){
        this.number = number;
        this.b1 = new UpButton();
        this.b2 = new DownButton();
    }

    public int getFloorNumber(){
        return number;
    }

    public void pressButton(Direction dir, int number){
        
    }
}
