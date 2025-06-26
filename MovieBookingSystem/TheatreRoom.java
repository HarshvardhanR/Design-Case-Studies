import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TheatreRoom {
    protected Screen screen;
    protected List<Seat> seats;
    protected HashSet<Seat> bookedSeats = new HashSet<>();

    public ScreenType getScreenType(){
        return screen.getScreenType();
    }
}

class ImaxTheatreRoom extends TheatreRoom{
    public ImaxTheatreRoom(){
        screen = new Imax();
        seats = new ArrayList<>();
    }
}

class StandardTheatreRoom extends TheatreRoom{
    public StandardTheatreRoom(){
        screen = new Standard();
        seats = new ArrayList<>();
    }
}


