import java.util.*;
public class StuyabloGame{
  private static final int WIDTH = 100;
  private static final int HEIGHT = 30;
  private static final int BORDER_COLOR = Text.WHITE;
  private static final int BORDER_BACKGROUND = Text.WHITE + Text.BACKGROUND;

  public static void main(String[] args) {
    run();
  }



//REMEMBER TO MAKE THE HEALTH CHANGE COLORS WHEN IT REACHES A CERTAIN PERCENT










  //Display a List of 1-4 adventurers on the rows row through row+3 (4 rows max)
  //Should include Name and HP on 2 separate lines. (more to be added later)
  public static void drawParty(ArrayList<Adventurer> party,int startRow){
    /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
    for (int i = 0; i < party.size(); i ++) {
      int col = 2;
      if ( i == 0 ) {
      Text.go(startRow, col);
    } else {
      Text.go(startRow, col + i * (WIDTH - 1) / (party.size()) );
    }
      System.out.print(Text.colorize("" + party.get(i), Text.WHITE));
      Text.go(startRow + 1, col + i * (WIDTH - 1) / (party.size()));
      System.out.print("HP: " + Text.colorize("" + party.get(i).getHP(), Text.GREEN) + Text.colorize("/" + party.get(i).getmaxHP(), Text.GREEN));
      Text.go(startRow + 2, col + i * (WIDTH - 1) / (party.size()));
      System.out.print("" + party.get(i).getSpecialName() + ": " + Text.colorize("" + party.get(i).getSpecial(), Text.CYAN) + Text.colorize("/" + party.get(i).getSpecialMax(), Text.CYAN));
    }

  }

  //Display a line of text starting at column 2 of the specified row.
  public static void drawText(String s,int startRow){
    /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //YOUR CODE HERE
    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
    Text.go(startRow, 2);
    System.out.print(s);
  }

  public static void drawScreen(){
    /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //YOUR CODE HERE
    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/

    Text.hideCursor();
    Text.clear();

    for (int i = 1; i < WIDTH + 1; i ++) {
      Text.go(1,i);
      System.out.print(Text.colorize(" ", BORDER_BACKGROUND));
      Text.go(HEIGHT,i);
      System.out.print(Text.colorize(" ", BORDER_BACKGROUND));
    }

    for (int i = 1; i < HEIGHT + 1; i ++) {
      Text.go(i,1);
      System.out.print(Text.colorize(" ", BORDER_BACKGROUND));
      Text.go(i, WIDTH);
      System.out.print(Text.colorize(" ", BORDER_BACKGROUND));
    }

    Text.showCursor();
  }


  public static void run(){
    //Clear and initialize
    Text.hideCursor();
    Text.clear();
    Text.go(1,1);


    //Things to attack:
    //Make an ArrayList of Adventurers and add 1 enemy to it.
    ArrayList<Adventurer>enemies = new ArrayList<>();
    /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //YOUR CODE HERE
    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/

    enemies.add(new Warrior("Bob"));
    //Adventurers you control:
    //Make an ArrayList of Adventurers and add 3 Adventurers to it.
    ArrayList<Adventurer> party = new ArrayList<>();
    /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //YOUR CODE HERE
    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
    party.add(new Wizard("Harry Potter"));
    party.add(new Wizard());
    party.add(new Warrior("Barbarian"));
    //Main loop
    boolean partyTurn = false;
    int whichPlayer = 0;
    int turn = 0;


    String input = "";
    Scanner in = new Scanner(System.in);
    while(! (input.equalsIgnoreCase("q") || input.equalsIgnoreCase("quit"))){

      //Draw the window border
      Text.hideCursor();
      drawScreen();

      //display event based on last turn's input
      if(partyTurn){
        //Process user input:
        if(input.equals("attack") || input.equals("")){
          /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
          //YOUR CODE HERE
          /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
          drawText(party.get(whichPlayer).attack(enemies.get(0)), HEIGHT / 3);
        }
        else if(input.equals("special")){
          /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
          //YOUR CODE HERE
          /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
          drawText(party.get(whichPlayer).specialAttack(enemies.get(0)), HEIGHT / 3);
        }
        whichPlayer++;



        if(whichPlayer < party.size()){
          drawText("Enter command for "+party.get(whichPlayer)+
                   ": attack/special/quit",HEIGHT/2);
        }else{
          drawText("press enter to see monster's turn",HEIGHT/2);
          partyTurn = false;
        }
      }else{
        //this block ignores user input!
        //display enemy attack except on turn 0.
        if(turn > 0){
          //Enemy action choices go here!
          /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
          //YOUR CODE HERE
          /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/

          drawText(enemies.get(0).attack(party.get( (int) (Math.random() * party.size() ))), HEIGHT / 3); // You can change who the enemies attack in the future
        }

        //after enemy goes, change back to player's turn.
        partyTurn=true;
        whichPlayer = 0;
        //display which player's turn is next and prompt for action.
        drawText("Enter command for "+party.get(whichPlayer)+": attack/special/quit",HEIGHT / 2 );

        //end the turn.
        turn++;

      }

      //display current state of all Adventurers
      drawParty(party,2);
      drawParty(enemies,HEIGHT-5);

      //Draw the prompt
      Text.reset();
      Text.go(HEIGHT+1,1);
      Text.showCursor();
      System.out.print(">");
      //Read user input
      input = in.nextLine();
    }

    //After quit reset things:
    Text.reset();
    Text.showCursor();
    Text.go(32,1);
  }




}
