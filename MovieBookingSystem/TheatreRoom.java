import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TheatreRoom {
    protected String theatreRoomNum;
    protected Screen screen;
    protected List<Seat> seats;
    protected HashSet<Seat> bookedSeats = new HashSet<>();

    public ScreenType getScreenType(){
        return screen.getScreenType();
    }

    public String getTheatreRoomNum(){
        return theatreRoomNum;
    }

    public List<Seat> getAvailableSeats(){
        List<Seat> availableSeat = new ArrayList<>();
        for(int i=0; i<seats.size(); i++){
            if(!bookedSeats.contains(seats.get(i))){
                availableSeat.add(seats.get(i));
            }
        }
        return availableSeat;
    }
}

class ImaxTheatreRoom extends TheatreRoom{
    public ImaxTheatreRoom(String theatreRoomNum){
        this.theatreRoomNum = theatreRoomNum;
        screen = new Imax();
        seats = new ArrayList<>();
    }
}

class StandardTheatreRoom extends TheatreRoom{
    public StandardTheatreRoom(String theatreRoomNum){
        this.theatreRoomNum = theatreRoomNum;
        screen = new Standard();
        seats = new ArrayList<>();
    }
}


