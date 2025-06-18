package CarRentalSystem;

public class RentalStore {
    Location location;
    VehicleInventory vehicleInventory;
    int storeNo;

    public RentalStore(Location location, int storeNo, VehicleInventory vehicleInventory){
        this.location = location;
        this.vehicleInventory = vehicleInventory;
        this.storeNo = storeNo;

    }
}
