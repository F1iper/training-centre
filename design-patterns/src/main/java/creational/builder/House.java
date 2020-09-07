package creational.builder;

public class House {
    private final String roof;
    private final String floors;
    private final String doors;
    private final String walls;

    private House(HouseBuilder houseBuilder) {
        this.roof = houseBuilder.roof;
        this.floors = houseBuilder.floors;
        this.doors = houseBuilder.doors;
        this.walls = houseBuilder.walls;
    }

    public String getRoof() {
        return roof;
    }

    public String getFloors() {
        return floors;
    }

    public String getDoors() {
        return doors;
    }

    public String getWalls() {
        return walls;
    }

    @Override
    public String toString() {
        return "House{" +
                "roof='" + roof + '\'' +
                ", floors='" + floors + '\'' +
                ", doors='" + doors + '\'' +
                ", walls='" + walls + '\'' +
                '}';
    }

    public static class HouseBuilder {
        private String roof;
        private String floors;
        private String doors;
        private String walls;


        public HouseBuilder() {
            this.roof = roof;
            this.floors = floors;
            this.doors = doors;
            this.walls = walls;
        }

        public HouseBuilder buildRoof( String roof) {
            this.roof = roof;
            return this;
        }

        public HouseBuilder buildFloors(String floors) {
            this.floors = floors;
            return this;
        }

        public HouseBuilder buildDoors(String doors) {
            this.doors = doors;
            return this;
        }

        public HouseBuilder buildWalls(String walls) {
            this.walls = walls;
            return this;
        }

        public House build(){
            return new House(this);
        }


    }

    public static void main(String[] args) {
    House woodgHouse = new House.HouseBuilder()
            .buildDoors("Wood doors")
            .buildFloors("Wood floors")
            .buildWalls("Wood walls")
            .buildRoof("Material roof")
            .build();

    House stoneHouse = new House.HouseBuilder()
            .buildDoors("stone doors")
            .buildFloors("stone floors")
            .buildWalls("stone walls")
            .buildRoof("stone roof")
            .build();

        System.out.println(woodgHouse);
        System.out.println(stoneHouse);
    }
}
