package lesson1.methods;

public class Main {

public static String isPositive (int temperature) {
    if(temperature > 0) return "Temperature is over 0, it shows: +" + temperature;
    else if(temperature < 0) return "Temperature is less then 0, looks like: " + temperature;
    else return "Temperature :" + temperature;
    }

    public static void main(String[] args) {

        System.out.println(isPositive(-0));
    }
}
