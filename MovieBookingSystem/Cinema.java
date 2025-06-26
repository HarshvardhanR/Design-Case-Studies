import java.util.ArrayList;
import java.util.List;

public class Cinema{
    CityName city;
    List<TheatreRoom> theatreRooms;

    public Cinema(CityName city){
        this.city = city;
        theatreRooms = new ArrayList<>();
    }

    public CityName getCity(){
        return city;
    }

    public void getTheatreRooms(){
        for(int i=0; i<theatreRooms.size(); i++){
            System.out.println("Theatre Available: " + theatreRooms.get(i).getTheatreRoomNum());
        }
    }
}