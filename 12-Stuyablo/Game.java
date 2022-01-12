import java.util.Scanner;
public class Game{
  public static void main(String[] args) {
    Text.hideCursor();
    Text.clear();

    for (int i = 1; i < 81; i ++) {
      Text.go(1,i);
      System.out.print(Text.colorize(" ", Text.YELLOW + Text.BACKGROUND));
      Text.go(30,i);
      System.out.print(Text.colorize(" ", Text.YELLOW + Text.BACKGROUND));
    }

    for (int i = 1; i < 31; i ++) {
      Text.go(i,1);
      System.out.print(Text.colorize(" ", Text.YELLOW + Text.BACKGROUND));
      Text.go(i, 80);
      System.out.print(Text.colorize(" ", Text.YELLOW + Text.BACKGROUND));
    }

    Text.go(31,1);
    System.out.print(Text.colorize(">", Text.WHITE));
    Text.showCursor();

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
