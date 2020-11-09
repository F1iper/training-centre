package structural.decorator.game;

public class RoadDecorator extends TerrainDecorator {

    public RoadDecorator(Terrain terrain) {
        super(terrain);
    }

    @Override
    public String getDescription() {
        return terrain.getDescription() + " przez, ktory przebiega droga";
    }

    @Override
    public int getFuelCost() {
        return terrain.getFuelCost() - 10;
    }
}
