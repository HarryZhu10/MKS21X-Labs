import java.util.Scanner;
import java.io.File;
import java.util.Arrays;
import java.io.FileNotFoundException;
public class Wrapping {
  public static void main(String[] args) {
    File argFile = new File(args[0]);
    if (Integer.parseInt(args[1]) == 1) {
      Scanner in = new Scanner(argFile);
      try{
        while (in.hasNextLine()) {
          String str = in.nextLine();
          int count = 0;
          int score = 0; // strings with scores of 3 will be deemed nice
          for (int i = 0; i < str.length(); i ++) {
            if (str.substring(i, i + 1).equals("a") || str.substring(i, i + 1).equals("e") || str.substring(i, i + 1).equals("i") || str.substring(i, i + 1).equals("o") || str.substring(i, i + 1).equals("u")) {
              count ++;
            }
            
          }

        }
      } catch (FileNotFoundException ex) {

      }
    }
  }
}
