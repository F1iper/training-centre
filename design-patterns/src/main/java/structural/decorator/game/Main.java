package structural.decorator.game;


public class Main {
    public static void main(String[] args) {

        generateMap();
    }

    private static void generateMap() {
        Terrain terrain1 = new Plain();
        Terrain terrain2 = new Hill();
        Terrain terrain3 = new SwampDecorator(new Hill());
        Terrain terrain4 = new ForestDecorator(new Plain());
        Terrain terrain5 = new SwampDecorator(new ForestDecorator(new Plain()));
        Terrain terrain6 = new RoadDecorator(new Hill());

        System.out.println(terrain6.getDescription() + ", " + terrain6.getFuelCost());


        System.out.println("Swamp Forest Plain cost : " + terrain5.getFuelCost());
        System.out.println("Swamp hill cost : " + terrain3.getFuelCost());
        System.out.println("Forrest Plain cost : " + terrain4.getFuelCost());


    }
}
