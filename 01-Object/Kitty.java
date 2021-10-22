public class Kitty {

  private String name;
  private int age;

public Kitty() {
  name = "Mittens";
  age = 2;
}

  public Kitty(String startName, int startAge) {
    name = startName;
    age = startAge;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void makeOlder() {
    age += 1;
  }


  public void changeName (String newName) {
    name = newName;
  }

}
