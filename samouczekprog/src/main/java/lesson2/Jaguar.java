package lesson2;

public class Jaguar implements Animal {

  private String name;
  private int age;
  private String idNumber;

  public Jaguar(String name, int age, String idNumber) {
    this.name = name;
    this.age = age;
    this.idNumber = idNumber;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getIdNumber() {
    return idNumber;
  }

  public void setIdNumber(String idNumber) {
    this.idNumber = idNumber;
  }

  @Override
  public String toString() {
    return "Jaguar named: " + name + ", of age: " + age + ", with ID: " + idNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String checkAnimalName(Animal animal) {
    return "Jaguar";
  }
}
