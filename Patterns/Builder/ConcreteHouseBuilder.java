package Builder;

public class ConcreteHouseBuilder implements HouseBuilder {
    private House house;

    public ConcreteHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        house.setFoundation("Concrete, brick, and stone");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Concrete blocks");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Concrete and steel");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Drywall and paint");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
