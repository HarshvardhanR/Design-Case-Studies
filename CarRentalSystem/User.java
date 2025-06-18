package CarRentalSystem;

public class User {
    private final int userId;
    private final Reservation r;
    private final String drivinglicenseNo;

    public User(int userId, Reservation r, String drivinglicenseNo){
        this.userId = userId;
        this.r = r;
        this.drivinglicenseNo = drivinglicenseNo;
    }
    public int getUserID(){
        return userId;
    }

    public String getDrivingLicenseNo(){
        return drivinglicenseNo;
    }

    public Reservation getReservation(){
        return r;
    }

}
