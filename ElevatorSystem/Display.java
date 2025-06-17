package ElevatorSystem;

public class Display {
    int floorNumber;
    Direction d;
    public Display(int floorNumber, Direction d){
        this.floorNumber = floorNumber;
        this.d = d;
    }

    public void showFloor(){
        System.out.println(floorNumber);
    }

    public void showDirection(){
        System.out.println(d);
    }
}
