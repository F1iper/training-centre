package staticcomponents;

import static staticcomponents.Calculator.*;

class CalculatorTest {

  public static void main(String[] args) {
    double r = 10;
    System.out.println("Pole kola: " + circleArea(r));
    System.out.println("Obwod kola: " + circlePerimeter(r));
    System.out.println("PI: " + PI);
  }
}
