public class Game{
  public static void main(String[] args) {
    Adventurer a = new Warrior("Conan","Aaaaaaaar!",20);
    Adventurer b = new Warrior("Homer","Donuts?",0);
    Adventurer c = new Wizard("Gandalf","Don't underestimate me!", 10);

    System.out.println(a+" ("+a.getHP()+"HP)");
    System.out.println(b+" ("+b.getHP()+"HP)");
    System.out.println(c +" ("+c.getHP()+"HP)");
    c.attack(a);
    a.attack(b);
    b.attack(c);
    System.out.println(a+" ("+a.getHP()+"HP)");
    System.out.println(b+" ("+b.getHP()+"HP)");
    System.out.println(c + " ("+c.getHP()+"HP)");
    c.specialAttack(a);
    a.specialAttack(b);
    System.out.println(a+" ("+a.getHP()+"HP)");
    System.out.println(b+" ("+b.getHP()+"HP)");
    System.out.println(c + " ("+c.getHP()+"HP)");

    }

}
