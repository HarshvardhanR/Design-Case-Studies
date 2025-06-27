public class ParkingLot{
    ParkingLevels p;
    Vehicle v;
    public ParkingLot(ParkingLevels p, Vehicle v){
        this.p = p;
        this.v = v;
        p.setVehicleType(v);
    }

    public int availableSpaces(){
        return p.getAvailableSpots();
    }
}