package staticcomponents.exercise;

public class University {
  public static void main(String[] args) {

    System.out.println("Liczba studentow przed zapisami: " + Student.getStudentsNumber());
    Student jakub = new Student("Jakub", "Rzezniczak", 123456);
    Student anna = new Student("Anna", "Miauczynska", 654321);
    System.out.println("Liczba studentow po zapisach: " + Student.getStudentsNumber());

  }
}
