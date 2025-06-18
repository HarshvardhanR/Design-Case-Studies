package CarRentalSystem;
import java.util.Calendar;
import java.util.Date;
public class Reservation {
    Vehicle v;
    Date from;
    Date to;
    RentalStore rentalStore;
    User user;

    public Reservation(Vehicle v, RentalStore rentalStore, User user, int days){
        this.v = v;
        this.from = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(this.from);
        cal.add(Calendar.DATE, days);
        this.to = cal.getTime();
        this.rentalStore = rentalStore;
        this.user = user;
        v.setVehicleState(VehicleState.NOT_AVAILABLE);
    }

    public Date getFrom(){
        return from;
    }

    public Date getTo(){
        return to;
    }
}
