public class Wizard extends Adventurer {
private int staffSize;
private String catchPhrase;
private int maxStaffSize;

public Wizard() {
  this("Gandalf");
}

public Wizard(String name) {
  this(name, "You shall not pass!", 10);
}

public Wizard(String name, String catchPhrase, int staffSize) {
  super(name, 20 + (int) (Math.random() * 10));
  setCatchPhrase(catchPhrase);
  setStaffSize(staffSize);
  this.maxStaffSize = staffSize;
}

public String attack(Damageable other){
  int damage = (int) (Math.random() * 10);
  other.applyDamage(damage);
  setStaffSize(getStaffSize() + 1);
  return ("The mythical " + this + " attacked " + other + " for " + damage + " damage!");
}

public String specialAttack(Damageable other) {
  if (getStaffSize() >= 10) {
    int heal = (int) (Math.random() * 10) + 1;
    setHP(getHP() + heal);
    int damage = (int) (Math.random() * 20);
    other.applyDamage(damage);
    setStaffSize(getStaffSize() - 10);
    return (this + " has healed itself for " + heal + " HP " + " and attacked " + other + " for " + damage + " damage!");
  } else {
    attack(other);
    System.out.println("Your staff is too small!");
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

public String getSpecialName() {
  return "Staff Size";
}

public int getSpecialMax() {
  return maxStaffSize;
}

public int getSpecial() {
  return staffSize;
}

}
