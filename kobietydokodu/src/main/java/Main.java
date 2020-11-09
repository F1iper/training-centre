import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    fillList();
    System.out.println(sortList(fillList()));

  }

  public static List<Integer> fillList() {
    List<Integer> numbers = new ArrayList<Integer>();
    Random rnd = new Random();
    for (int i = 0; i < 20; i++) {
      int temp = rnd.nextInt(50 + 1);
      numbers.add(temp);
      System.out.println(numbers.get(i));
    }
    return numbers;
  }

  private static List<Integer> sortList(List<Integer> toSort) {
    Collections.sort(toSort);
    return toSort;
  }
}
