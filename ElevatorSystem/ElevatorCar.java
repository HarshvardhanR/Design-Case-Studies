package ElevatorSystem;

import java.util.ArrayList;
import java.util.List;

public class ElevatorCar {
    int id;
    State state ;
    List<InternalButton> buttons = new ArrayList<>();
    Display d;
}
