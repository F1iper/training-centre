package fizzbuzz;

import java.util.stream.IntStream;

public class StreamLoopImpl implements FizzBuzz {
    
    public void print (int from, int to) {
        int[] array = IntStream.rangeClosed(from, to).toArray();
        
        for(Integer i : array) {
            if(i % 5 == 0 && i % 3 == 0)
                System.out.println(i + " FizzBuzz");
            else if(i % 3 == 0)
                System.out.println(i + " Fizz");
            else if(i % 5 == 0)
                System.out.println(i + " Buzz");
        }
    }
}
