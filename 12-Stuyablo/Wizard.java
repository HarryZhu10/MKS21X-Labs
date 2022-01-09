public class Wizard extends Adventurer {
private int staffSize;
private String catchPhrase;

pubic Wizard() {
  this("Gandalf");
}

public Wizard(String name) {
  this(name, "You shall not pass!", 10);
}

public Wizard(String name, String catchPhrase, int staffSize) {

}


public void applyDamage() {

}

public void setCatchPhrase (String catchPhrase) {
  this.catchPhrase = catchPhrase;
}

public int getStaffSize () {
  return staffSize;
}

public void setStaffSize (int staffSize) {
  this.staffSize = staffSize;
}

}
