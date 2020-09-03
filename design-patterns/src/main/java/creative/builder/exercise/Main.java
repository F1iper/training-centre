package creative.builder.exercise;

public class Main {
    public static void main(String[] args) {

        FlightLeg flightLeg = new FlightLeg.Builder("Los Angeles", "New York")
                .price(2198.43)
                .build();
        System.out.println(flightLeg);


    }
}
