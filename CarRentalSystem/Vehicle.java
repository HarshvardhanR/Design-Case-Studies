package CarRentalSystem;

public class Vehicle {
    protected VehicleType vehicleType;
    protected int noOfSeats;
    protected int kmDriven;
    protected String model;
    protected String licensePlate;
    protected VehicleState vehicleState;

    public int getNoOfSeats(){
        return noOfSeats;
    }

    public int getKmDriven(){
        return kmDriven;
    }

    public String getModel(){
        return model;
    }

    public String getLicensePlate(){
        return licensePlate;
    }

    public VehicleState getVehicleState(){
        return vehicleState;
    }
    public void setVehicleState(VehicleState vehicleState){
        this.vehicleState = vehicleState;
    }

}

class Car extends Vehicle{
    public Car(int noOfSeats, int kmDriven, String model, String licensePlate){
        this.vehicleType = VehicleType.CAR;
        this.noOfSeats = noOfSeats;
        this.kmDriven = kmDriven;
        this.model = model;
        this.licensePlate = licensePlate;
        this.vehicleState = VehicleState.AVAILABLE;
    }
}
