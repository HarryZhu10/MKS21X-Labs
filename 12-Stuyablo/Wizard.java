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
  super(name, 20 + (int) (Math.random() * 10));
  setCatchPhrase(catchPhrase);
  setStaffSize(staffSize);
}

public void attack(Damageable other){
  int damage = (int) (Math.random() * 10);
  other.applyDamage(damage);
  setStaffSize(getStaffSize() + 1);
  System.out.println("The mythical " + this + " attacked " + other + " for " + damage + " damage!");
}

public void specialAttack(Damageable other) {
  if (getStaffSize() >= 10) {
    int heal = (int) (Math.random() * 10) + 1;
    setHP(getHP() + heal);
    int damage = (int) (Math.random() * 20);
    other.applyDamage(damage);
    System.out.println(this " has healed itself for " + heal " HP " + " and attacked for " + damage " damage!");
    setStaffSize(getStaffSize() - 10);
  } else {
    System.out.println("Your staff is too small!")
    attack(other);
  }
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
