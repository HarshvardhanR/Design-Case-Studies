import java.util.ArrayList;
import java.util.List;

public class MainPage {
    List<Cinema> cinemaList;

    public MainPage(CityName city) {
        cinemaList = new ArrayList<>();
        createCinema();
        createTheatres();
        createSeats();
        setMovie();
        getCinemas(city);
        printSeats(city);
    }

    public void createCinema() {
        cinemaList.add(new Cinema(CityName.BANGALORE));
        cinemaList.add(new Cinema(CityName.MUMBAI));
    }

    public void createTheatres() {
        for (int i = 0; i < cinemaList.size(); i++) {
            cinemaList.get(i).getTheatreRoomsList().add(new ImaxTheatreRoom(1 + "-Imax"));
            cinemaList.get(i).getTheatreRoomsList().add(new StandardTheatreRoom(1 + "-Standard"));
        }
    }

    public void createSeats() {
        for (int i = 0; i < cinemaList.size(); i++) {
            List<TheatreRoom> room = cinemaList.get(i).getTheatreRoomsList();
            for (int j = 0; j < room.size(); j++) {
                for (int k = 1; k <= 5; k++) {
                    String seatNumNormal = i + "-" + j + "-" + k + "-Normal";
                    String seatNumRecliner = i + "-" + j + "-" + k + "-Recliner";
                    room.get(j).getSeatList().add(new Normal(seatNumNormal));
                    room.get(j).getSeatList().add(new Recliner(seatNumRecliner));
                }
            }
        }
    }

    public void setMovie() {
        for (int i = 0; i < cinemaList.size(); i++) {
            List<TheatreRoom> room = cinemaList.get(i).getTheatreRoomsList();
            for (int j = 0; j < room.size(); j++) {
                room.get(j).getScreen().setMovie(new Movie(j + 1, "Drishyam", 50));
            }
        }
    }

    public void getCinemas(CityName city) {
        for (int i = 0; i < cinemaList.size(); i++) {
            if (cinemaList.get(i).getCity() == city) {
                List<TheatreRoom> room = cinemaList.get(i).getTheatreRoomsList();
                for (int j = 0; j < room.size(); j++) {
                    room.get(j).printDetails();
                }
            }
        }
    }

    public void printSeats(CityName city) {
        for (Cinema cinema : cinemaList) {
            if (cinema.getCity() == city) {
                System.out.println("Cinema in " + city + ":");
                for (TheatreRoom room : cinema.getTheatreRoomsList()) {
                    System.out.println("  Theatre Room: " + room.getTheatreRoomNum());
                    for (Seat seat : room.getSeatList()) {
                        System.out.println("    Seat: " + seat.getSeatNum() +
                                " | Type: " + seat.getSeatType() +
                                " | Booked: " + seat.isBooked());
                    }
                }
            }
        }
    }

}
