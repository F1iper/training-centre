package fizzbuzz;

public class ForLoopImpl implements FizzBuzz {
    @Override
    public void print (int from, int to) {
        String fizz = "Fizz";
        String buzz = "Buzz";
        
        for (int i = from; i <= to; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println(i + " " + fizz + buzz);
            else if (i % 3 == 0)
                System.out.println(i + " " + fizz);
            else if (i % 5 ==0)
                System.out.println(i + " " + buzz);
        }
    }
}
