package fizzbuzz;

public class WhileLoopImpl implements FizzBuzz {
    @Override
    public void print (int from, int to) {
        String fizz = "Fizz";
        String buzz = "Buzz";
        
        while(from <= to) {
                if (from % 3 == 0 && from % 5 == 0)
                    System.out.println(from + " " + fizz + buzz);
                else if (from % 3 == 0)
                    System.out.println(from + " " + fizz);
                else if (from % 5 ==0)
                    System.out.println(from + " " + buzz);
            from ++;
        }
    }
}
