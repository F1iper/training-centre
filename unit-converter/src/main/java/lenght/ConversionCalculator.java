package lenght;

import java.util.Scanner;

public class ConversionCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Convert from: " );
        String fromUnit = scanner.nextLine();

        System.out.println("Convert to: ");
        String toUnit = scanner.nextLine();

        LengthConverter givenUnit = new LengthConverter(fromUnit);
        LengthConverter resultUnit = new LengthConverter(toUnit);

        System.out.println("Value: ");
        double val = scanner.nextDouble();

        double meters = givenUnit.toMeters(val);
        double converted = resultUnit.toMeters(meters);

        System.out.println(converted);
    }
}
