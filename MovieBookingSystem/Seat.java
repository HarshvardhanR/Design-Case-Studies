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

    public String getSeatNum(){
        return no;
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj==null || this.getClass()!=obj.getClass()) return false;
        Seat seat = (Seat) obj;
        return this.no.equals(seat.getSeatNum());
    }

    @Override
    public int hashCode() {
        return no.hashCode();
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