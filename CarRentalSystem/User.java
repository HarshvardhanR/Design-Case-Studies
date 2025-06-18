package CarRentalSystem;

public class User {
    private final int userId;
    private Reservation r;
    private final String drivinglicenseNo;

    public User(int userId, String drivinglicenseNo){
        this.userId = userId;
        this.drivinglicenseNo = drivinglicenseNo;
    }

    public void setReservation(Reservation r){
        this.r = r;
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
