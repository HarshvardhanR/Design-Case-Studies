package CarRentalSystem;

public class Main {
    public static void main(String[] args) {
        Location location = new Location(15, "Ahmedabad", "Gujarat", "India");
        VehicleInventory vehicleInventory = new VehicleInventory();
        vehicleInventory.add(new Car(4, 10000, "MazdaRX8", "GJ02"));
        vehicleInventory.add(new Car(4, 15000, "Subaru", "GJ01"));
        RentalStore rentalStore = new RentalStore(location, 272, vehicleInventory);
        User user = new User(1, "JXR008");
        Reservation r = new Reservation(vehicleInventory.getVehicleList().get(0), rentalStore, user, 2);
    }
}
