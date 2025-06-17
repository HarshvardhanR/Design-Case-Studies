package ElevatorSystem;

public class ExternalButton {
    Direction d;
    public Direction getDirection(){
        return d;
    }
}

class UpButton extends ExternalButton{
    public UpButton(){
        d = Direction.UP;
    }
}

class DownButton extends ExternalButton{
    public DownButton(){
        d = Direction.DOWN;
    }
}
