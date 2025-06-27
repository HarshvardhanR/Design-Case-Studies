import java.util.HashMap;

abstract class ParkingLevels {
    Compact [] compacts;
    HandiCapped [] handicapped;
    Large [] large;
    TwoWheeler [] tw;
    Vehicle v;

    abstract int getAvailableSpots();
    public void setVehicleType(Vehicle v){
        this.v = v;
    }
}

class LevelOne extends ParkingLevels{
    HashMap<ParkingSpotType, ParkingSpots[]> map = new HashMap<>();
    public LevelOne(){
        compacts = new Compact[20];
        for (int i = 0; i < compacts.length; i++) compacts[i] = new Compact();
        map.put(ParkingSpotType.COMPACT, compacts);

        handicapped = new HandiCapped[20];
        for (int i = 0; i < handicapped.length; i++) handicapped[i] = new HandiCapped();
        map.put(ParkingSpotType.HANDICAPPED, handicapped);

        large = new Large[20];
        for (int i = 0; i < large.length; i++) large[i] = new Large();
        map.put(ParkingSpotType.LARGE, large);

        tw = new TwoWheeler[20];
        for (int i = 0; i < tw.length; i++) tw[i] = new TwoWheeler();
        map.put(ParkingSpotType.TWOWHEELER, tw);
        }

    public int getAvailableSpots() {
        int available = 0;
        VehicleType vt = v.getVehicleType();

        for (ParkingSpotType x : map.keySet()) {
            ParkingSpots[] spots = map.get(x);
            for (ParkingSpots spot : spots) {
                if (spot != null 
                    && spot.getParkedVehicle() == null 
                    && spot.getAllowedVehicles().contains(vt)) {
                    available++;
                }
            }
        }
        return available;
    }
}

class LevelTwo extends ParkingLevels{
    HashMap<ParkingSpotType, ParkingSpots[]> map = new HashMap<>();
    
    public LevelTwo(){
        compacts = new Compact[10];
        for (int i = 0; i < compacts.length; i++) compacts[i] = new Compact();
        map.put(ParkingSpotType.COMPACT, compacts);

        handicapped = new HandiCapped[20];
        for (int i = 0; i < handicapped.length; i++) handicapped[i] = new HandiCapped();
        map.put(ParkingSpotType.HANDICAPPED, handicapped);

        large = new Large[30];
        for (int i = 0; i < large.length; i++) large[i] = new Large();
        map.put(ParkingSpotType.LARGE, large);

        tw = new TwoWheeler[40];
        for (int i = 0; i < tw.length; i++) tw[i] = new TwoWheeler();
        map.put(ParkingSpotType.TWOWHEELER, tw);
        }


    public int getAvailableSpots() {
        int available = 0;
        VehicleType vt = v.getVehicleType();

        for (ParkingSpotType x : map.keySet()) {
            ParkingSpots[] spots = map.get(x);
            for (ParkingSpots spot : spots) {
                if (spot != null 
                    && spot.getParkedVehicle() == null 
                    && spot.getAllowedVehicles().contains(vt)) {
                    available++;
                }
            }
        }
        return available;
    }
}
