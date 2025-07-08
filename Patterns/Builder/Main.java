package Builder;

public class Main {
    public static void main(String[] args) {
        HouseBuilder builder = new ConcreteHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(builder);

        House house = engineer.constructHouse();
        house.showDetails();
    }
}
