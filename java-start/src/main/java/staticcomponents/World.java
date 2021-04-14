package staticcomponents;

public class World {
  public static void main(String[] args) {

    Human adam = new Human("Adam", 186.5);
    Human ewa = new Human("Ewa", 167.5);

    Human.avgHeight = (adam.getHeight() + ewa.getHeight()) /2;

    System.out.println(adam.getName() + " wzrost: " + adam.getHeight());
    System.out.println(ewa.getName() + " wzrost: " + ewa.getHeight());

    System.out.println("Avg height: ");
    System.out.println(Human.avgHeight);
  }

}
