public class Kitty {

  private String name;
  private int age;


  public Kitty(String startName, int startAge) {
    name = startName;
    age = startAge;
  }

  public String getName() {
    if (name == null) {
      return "Mittens";
    }
    return name;
  }

  public int getAge() {
    if (name == null) {
  return 2;
  }
    return age;
  }

  public void makeOlder() {
    age += 1;
  }


  public void changeName (String newName) {
    name = newName;
  }

}
