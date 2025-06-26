import java.util.ArrayList;
import java.util.List;

public class Cinema{
    private CityName city;
    private List<TheatreRoom> theatreRooms;

    public Cinema(CityName city){
        this.city = city;
        theatreRooms = new ArrayList<>();
    }

    public CityName getCity(){
        return city;
    }

    public List<TheatreRoom> getTheatreRoomsList(){
        return theatreRooms;
    }
}