package staticcomponents.exercise;

public class Student {

  private static int studentsNumber = 0;

  private String firstname;
  private String lastname;
  private int idNumber;

  public Student(String firstname, String lastname, int idNumber) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.idNumber = idNumber;
    studentsNumber ++;
  }

  public static int getStudentsNumber() {
    return studentsNumber;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public int getIdNumber() {
    return idNumber;
  }

  public void setIdNumber(int idNumber) {
    this.idNumber = idNumber;
  }
}
