package staticcomponents;

import java.util.Scanner;

public class PrintNumbers {

  private static final int EXIT = 5;
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    do {
      System.out.println("Podaj liczbe: ");
      int start = input.nextInt();
      System.out.println("Podaj druga liczbe: " );
      int end = input.nextInt();
      printNumbers(start, end);

      System.out.println("Koniec programu? Wprowadz: " + EXIT + ". ");
    } while(input.nextInt() != EXIT);

    input.close();
  }

  private static void printNumbers(int start, int end) {
    for (int i = start; i <= end; i++) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
