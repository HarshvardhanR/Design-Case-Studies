public interface Vehicle{
    public String getNumberPlate();
    public int getSpace();
    public VehicleType getVehicleType();
}

class MotorCycle implements Vehicle{
    private String licensePlate;
    private int size = 4;
    public MotorCycle(String plate){
        licensePlate = plate;
    }

    public String getNumberPlate(){
        return licensePlate;
    }

    public int getSpace(){
        return size;
    }

    public VehicleType getVehicleType(){
        return VehicleType.MOTORCYCLE;
    }
}

class Car implements Vehicle{
    private String licensePlate;
    private int size = 16;
    public Car(String plate){
        licensePlate = plate;
    }

    public String getNumberPlate(){
        return licensePlate;
    }

    public int getSpace(){
        return size;
    }

    public VehicleType getVehicleType(){
        return VehicleType.CAR;
    }
}

class Truck implements Vehicle{
    private String licensePlate;
    private int size = 32;
    public Truck(String plate){
        licensePlate = plate;
    }

    public String getNumberPlate(){
        return licensePlate;
    }

    public int getSpace(){
        return size;
    }

    public VehicleType getVehicleType(){
        return VehicleType.TRUCK;
    }
}

