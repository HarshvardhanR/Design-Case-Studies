public class Seat {
    protected boolean booked;
    protected SeatType seatType;
    protected String no;

    public SeatType getSeatType(){
        return seatType;
    }

    public boolean isBooked(){
        return booked;
    }

    public void setBookedStatus(boolean status){
        booked = status;
    }
}

class Normal extends Seat{
    public Normal(String no){
        this.no = no;
        booked = false;
        seatType = SeatType.NORMAL;
    }
}

class Recliner extends Seat{
    public Recliner(String no){
        this.no = no;
        booked = false;
        seatType = SeatType.RECLINER;
    }
}