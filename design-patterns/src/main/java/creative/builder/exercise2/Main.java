package creative.builder.exercise2;

public class Main {
    public static void main(String[] args) {

        Burger burgerBuilder = new Burger.BurgerBuilder()
                .bread("white")
                .onion(true)
                .onion(true)
                //todo : add more then one field
                .bacon(true)
                .cucumber(true)
                .tomato(true)
                .sauce("hot")
                .build();

        System.out.println(burgerBuilder);

    }
}
