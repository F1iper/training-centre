package codekata;

public class Kata {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 3, 2, 5};
        int[] array3 = {2, 2, 4, 3};

        System.out.println(getNth(array1, 2));
        System.out.println(getNth(array2, 3));
        System.out.println(getNth(array3, 4));


    }

    public static int getNth(int[] array, int n) {
        return n >= array.length ? -1 : (int) Math.pow(array[n], n);
    }

    public static int add(int num1,int num2){
        return num1+num2;
    }
}



