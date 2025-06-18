package CarRentalSystem;

import java.util.ArrayList;
import java.util.List;

public class VehicleInventory {
    List<Vehicle> vehicleList;

    public VehicleInventory(){
        vehicleList = new ArrayList<>();
    }

    public List<Vehicle> getVehicleList(){
        return vehicleList;
    }

    public void add(Vehicle v){
        vehicleList.add(v);
    }

    public void remove(Vehicle v){
        vehicleList.removeIf(vehicle -> vehicle.getLicensePlate().equals(v.getLicensePlate()));
    }
}
