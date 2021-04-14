package thestreams;

import java.util.Arrays;
import java.util.Random;

public class Streaming {
  private static final int NUMBERS_SIZE = 10;
  private static final String FILL_MESSAGE = "Filling the array in progress...";
  private static final String SORTED_MESSAGE = "The array is filled with random numbers and sorted.";

  public static void main(String[] args) {

    double[] numbersArray = fillAndSortTheNumberArray(NUMBERS_SIZE);
    countTheSumOfAllDigitsOfArray(numbersArray);
    double average = countTheAverageFromArray(numbersArray);
    System.out.println(average);

  }

  private static double countTheAverageFromArray(double[] numbers) {
    double total = 0;
    for(int i = 0; i< numbers.length; i++) {
      total += numbers[i];
    }
    double average = total / numbers.length;
    return average;
  }

  private static double[] fillAndSortTheNumberArray(int numbersSize) {
    Random rnd = new Random();
    System.out.println(FILL_MESSAGE);
    double[] numbers = new double[numbersSize];
    for (int i = 0; i < numbersSize; i++) {
      numbers[i] = (Math.random() * ((44.22 - 0.1) + 1)) + 0.1;
      System.out.println(i + 1 + " index is now number: " + numbers[i]);
    }
    System.out.println(SORTED_MESSAGE);
    sortArray(numbers);
    System.out.println(Arrays.toString(numbers));
    return numbers;
  }

  private static void sortArray(double[] numbers) {
    Arrays.sort(numbers);
  }


  public static double countTheSumOfAllDigitsOfArray(double[] numbers) {
    int sum = 0;
    for(int i = 0; i < numbers.length; i ++) {
      sum += numbers[i];
    }
    System.out.println("Sum of the numbers in array is: " + sum);
    return sum;
  }
}
