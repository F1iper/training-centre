package lesson3.Tasks;

public class BoxOnSteroids<T> {
  private T name;

  public BoxOnSteroids(T name) {
    this.name = name;
  }

  public T getName() {
    return name;
  }


  @Override
  public String toString() {
    return "BoxOnSteroids{" +
            "name=" + name +
            '}';
  }
}
