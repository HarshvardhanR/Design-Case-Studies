import java.util.ArrayList;
import java.util.List;

public class MainPage {
    List<Cinema> cinemaList;

    public MainPage(){
        cinemaList = new ArrayList<>();
        createCinema();
        createTheatres();
        createSeats();
        setMovie();
    }

    public void createCinema(){
        cinemaList.add(new Cinema(CityName.BANGALORE));
        cinemaList.add(new Cinema(CityName.MUMBAI));
    }

    public void createTheatres(){
        for(int i=0; i<cinemaList.size(); i++){
            cinemaList.get(i).getTheatreRoomsList().add(new ImaxTheatreRoom(1 + "-Imax"));
            cinemaList.get(i).getTheatreRoomsList().add(new StandardTheatreRoom(1 + "-Standard"));
        }
    }

    public void createSeats(){
        for(int i=0; i<cinemaList.size(); i++){
            List<TheatreRoom> room = cinemaList.get(i).getTheatreRoomsList();
            for(int j=0; j<room.size(); j++){
                for(int k=1; k<=5; k++){
                    room.get(j).getSeatList().add(new Normal(i + "-Normal"));
                    room.get(j).getSeatList().add(new Recliner(i + "-Recliner"));
                }
            }
        }
    }

    public void setMovie(){
        for(int i=0; i<cinemaList.size(); i++){
            List<TheatreRoom> room = cinemaList.get(i).getTheatreRoomsList();
            for(int j=0; j<room.size(); j++){
                room.get(i).getScreen().setMovie(new Movie(j+1, "Drishyam", 50));
            }
        }
    }

    

}
