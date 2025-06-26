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

    public void printTheatres(){
        for(int i=0; i<theatreRooms.size(); i++){
            
        }
    }
}