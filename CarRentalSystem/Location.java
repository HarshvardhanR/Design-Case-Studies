package CarRentalSystem;

public class Location {
    int streetNo;
    String city;
    String state;
    String country;

    public Location(int streetNo, String city, String state, String country){
        this.streetNo = streetNo;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getAddress(){
        return streetNo + ", " + city + " " + state + " " + country;
    }
}
