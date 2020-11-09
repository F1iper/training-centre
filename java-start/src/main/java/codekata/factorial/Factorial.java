package codekata.factorial;

public class Factorial {

    public static void main(String[] args) {

        System.out.println(factorial2(4));
    }

    public static int factorial(int n) {
        if (n < 0 || n > 12) {
            throw new IllegalArgumentException("Out of bounds");
        } else {
            int fact = 1;
            for (int i = 2; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }
    }
    public static int factorial2(int n ) {
        if(n < 0 || n > 12) throw new IllegalArgumentException("Useless fuffery!");
        return n <= 1 ? 1 : n * factorial2(n - 1);
    }
}