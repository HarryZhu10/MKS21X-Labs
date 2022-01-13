import java.util.Scanner;
public class Game{
  public static void reset (String userInput, int[] randInt) {
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
      Scanner in = new Scanner(System.in);

  if (!userInput.equals("")) {
      for (int x = 0; x < 4; x ++) {
        randInt[x] = (int) (Math.random() * 100);
      }
  }

      int index = 0;
      for (int x = 2; x < 81; x = x + 79/4) {
        Text.go(2,x);
        if (index < randInt.length) {
          if (randInt[index] < 25) {
            System.out.print(Text.colorize("" + randInt[index], Text.RED));
          } else if (randInt[index] > 75) {
            System.out.print(Text.colorize("" + randInt[index], Text.GREEN));
          } else {
            System.out.print(Text.colorize("" + randInt[index], Text.WHITE));
          }
          //THis is to check why some numbers have two colors
          Text.go(25, 2);
          System.out.println("" + randInt[index]);
        }
        index ++;
      }

    }
  }



  public static void main(String[] args) {
    Text.hideCursor();
    Text.clear();
    int[] randInt = new int[4];
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


        for (int i = 0; i < randInt.length; i ++) {
          randInt[i] = (int) (Math.random() * 100);
        }
    int index = 0;
    for (int x = 2; x < 81; x = x + 79/4) {
      Text.go(2,x);
      if (index < randInt.length) {
        if (randInt[index] < 25) {
          System.out.print(Text.colorize("" + randInt[index], Text.RED));
        } else if (randInt[index] > 75) {
          System.out.print(Text.colorize("" + randInt[index], Text.GREEN));
        } else {
          System.out.print(Text.colorize("" + randInt[index], Text.WHITE));
        }
        index ++;
      }
    }

    Scanner in = new Scanner(System.in);
    Text.go(31,1);
    System.out.print(">");
    String command = in.nextLine();
    while(!(command.equals("q") || command.equals("quit"))){

    if (command.equals("")) {
      reset(command, randInt);
    }  else {
      reset(command, randInt);
    }

    Text.go(31,1);
    System.out.print(">");
    Text.showCursor();
    command = in.nextLine();
  }
  in.close();

/*
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
*/
    }

}
