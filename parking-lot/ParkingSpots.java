import java.util.ArrayList;
import java.util.Arrays;

public interface ParkingSpots {
    public VehicleType getParkedVehicle();
    public void setParkedVehicle(Vehicle v);
    public String getVehicleLicense();
    public ArrayList<VehicleType> getAllowedVehicles();
}

class Compact implements ParkingSpots{
    Vehicle v;
    ArrayList<VehicleType> allowedVehicle = new ArrayList<>(Arrays.asList(VehicleType.MOTORCYCLE, VehicleType.CAR));
    public void setParkedVehicle(Vehicle v){
        this.v = v;
    }
    public VehicleType getParkedVehicle(){
        if(v==null){
            return null;
        }
        return v.getVehicleType();
    }

    public String getVehicleLicense(){
        return v.getNumberPlate();
    }

    public ArrayList<VehicleType> getAllowedVehicles(){
        return allowedVehicle;
    }

}

class Large implements ParkingSpots{
    Vehicle v;
    ArrayList<VehicleType> allowedVehicle = new ArrayList<>(Arrays.asList(VehicleType.TRUCK, VehicleType.CAR));
    public void setParkedVehicle(Vehicle v){
        this.v = v;
    }
    public VehicleType getParkedVehicle(){
        if(v==null){
            return null;
        }
        return v.getVehicleType();
    }
    public String getVehicleLicense(){
        return v.getNumberPlate();
    }
    public ArrayList<VehicleType> getAllowedVehicles(){
        return allowedVehicle;
    }
}

class HandiCapped implements ParkingSpots{
    Vehicle v;
    ArrayList<VehicleType> allowedVehicle = new ArrayList<>(Arrays.asList(VehicleType.CAR));
    public void setParkedVehicle(Vehicle v){
        this.v = v;
    }
    public VehicleType getParkedVehicle(){
        if(v==null){
            return null;
        }
        return v.getVehicleType();
    }
    public String getVehicleLicense(){
        return v.getNumberPlate();
    }
    public ArrayList<VehicleType> getAllowedVehicles(){
        return allowedVehicle;
    }
}

class TwoWheeler implements ParkingSpots{
    Vehicle v;
    ArrayList<VehicleType> allowedVehicle = new ArrayList<>(Arrays.asList(VehicleType.MOTORCYCLE));
    public void setParkedVehicle(Vehicle v){
        this.v = v;
    }
    public VehicleType getParkedVehicle(){
        if(v==null){
            return null;
        }
        return v.getVehicleType();
    }
    public String getVehicleLicense(){
        return v.getNumberPlate();
    }
    public ArrayList<VehicleType> getAllowedVehicles(){
        return allowedVehicle;
    }
}
