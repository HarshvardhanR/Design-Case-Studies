package Builder;

public class CivilEngineer {
    private HouseBuilder houseBuilder;

    public CivilEngineer(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse() {
        houseBuilder.buildFoundation();
        houseBuilder.buildStructure();
        houseBuilder.buildRoof();
        houseBuilder.buildInterior();
        return houseBuilder.getHouse();
    }
}
