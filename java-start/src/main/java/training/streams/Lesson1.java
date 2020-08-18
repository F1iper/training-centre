package training.streams;

import java.util.ArrayList;
import java.util.List;

public class Lesson1 {
    
    public static void main (String[] args) {
        
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        int sumOfElements = numbers.stream()
          .filter(o -> o % 2 == 0)
          .mapToInt(o -> o.intValue())
          .sum();
    
        System.out.println(sumOfElements);
    }
}
