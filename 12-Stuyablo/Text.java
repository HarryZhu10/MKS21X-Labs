public class Text{
  /*Base colors*/
  public static final int BLACK = 30;
  public static final int RED = 31;
  public static final int GREEN = 32;
  public static final int YELLOW = 33;
  public static final int BLUE = 34;
  public static final int MAGENTA = 35;
  public static final int CYAN = 36;
  public static final int WHITE = 37;

  /*Text modifiers to be ADDED to a color*/
  public static final int BACKGROUND = 10;
  public static final int BRIGHT = 60;

  /*Text modifiers that are separate from color*/
  public static final int BOLD = 1;
  public static final int UNDERLINE = 4;
  public static final int INVERTED = 7;

  /*Reset colors*/
  public static void reset(){
    System.out.print("\u001b[0m");
  }


  public static void hideCursor(){
    System.out.print("\u001b[?25l");
  }

  public static void showCursor(){
    System.out.print("\u001b[?25h");
  }

  /*Move the cursor to a specified row/col on the terminal*/
  public static void go(int row,int col){
      System.out.print("\u001b[" + row + ";" + col + "f");
  }

  /*Erases all text on the terminal.*/
  public static void clear(){
    System.out.print("\u001b[2J");
  }

  /*Overloaded Colorize methods.
    c1,c2 and c3 are any color modifiers such as bold/color/background color etc.
  */
  public static String colorize(String text,int c1){
    return ("\u001b[" + c1 + "m"+text+"\u001b[0m");
  }
  public static String colorize(String text,int c1,int c2){
    return ("\u001b[" + c1 + ";" + c2 + "m"+text+"\u001b[0m");
  }
  public static String colorize(String text,int c1,int c2,int c3){
    return ("\u001b[" + c1 + ";" + c2 + ";" + c3 + "m"+text+"\u001b[0m");
  }


  //Tested and working in:
  //git-bash (windows 10),    wsl (windows 10+11),   powershell windows 11
  public static void main(String[] args) {
    hideCursor();
    clear();

    for (int i = 1; i < 81; i ++) {
      go(1,i);
      System.out.print(colorize(" ", RED + BACKGROUND, BOLD));
      go(30,i);
      System.out.print(colorize(" ", RED + BACKGROUND, BOLD));
    }

    for (int i = 1; i < 31; i ++) {
      go(i,1);
      System.out.print(colorize(" ", RED + BACKGROUND, BOLD));
      go(i, 80);
      System.out.print(colorize(" ", RED + BACKGROUND, BOLD));
    }

    int[] randInt = new int[4];

    for (int i = 0; i < randInt.length; i ++) {
      randInt[i] = (int) (Math.random() * 10) + (int) (Math.random() * 100);
    }

    int index = 0;
    for (int x = 2; x < 81; x = x + 79/4) {
      go(2,x);
      if (index < randInt.length) {
        if (randInt[index] < 25) {
          System.out.print(colorize("" + randInt[index], RED));
        } else if (randInt[index] > 75) {
          System.out.print(colorize("" + randInt[index], GREEN));
        } else {
          System.out.print(colorize("" + randInt[index], WHITE));
        }
        index ++;
      }
    }
    go(31,1);
    showCursor();
  }
}
