import java.util.Scanner;
import java.io.File;
import java.util.Arrays;
import java.io.FileNotFoundException;
public class Non {

  public static void main(String[] args) {
    File argFile = new File(args[0]);
    int total = 0;
    int total2 = 0;
    if (Integer.parseInt(args[1]) == 1) {
      try {
        Scanner in = new Scanner(argFile);
        while (in.hasNextLine()) {
          String str = in.nextLine();
          int count = 0;
          int score = 0;
          for (int i = 0; i < str.length(); i ++) {
            if (str.substring(i, i + 1).equals("a") || str.substring(i, i + 1).equals("e") || str.substring(i, i + 1).equals("i") || str.substring(i, i + 1).equals("o") || str.substring(i, i + 1).equals("u")) {
              count ++;
            }
            if (i < str.length() - 1) {
            if (str.substring(i, i + 1).equals(str.substring(i + 1, i + 2))) {
              score = 1;
            }
          }

        }
        if (str.contains("ab")||str.contains("cd")||str.contains("pq")||str.contains("xy")) {
          score --;
        }
        if (count >= 3) {
          score ++;
        }
        if (score == 2) {
          total++;
        }
      }
      } catch (FileNotFoundException ex) {

      }
      System.out.println("" + total);
  }

  if (Integer.parseInt(args[1]) == 2) {
    try {
      Scanner in = new Scanner(argFile);
      while (in.hasNextLine()) {
        int score = 0;
        String str = in.nextLine();
        String str1 = "";
        String str2 = "";
        boolean stop1 = false;
        boolean stop2 = false;
        for (int i = 0; i < str.length() - 3; i ++) {
          str1 = str.substring(i,i + 2);
          for (int x = i + 2; x < str.length() - 1; x ++) {
            str2 = str.substring(x, x + 2);
            if (str1.equals(str2) && !stop1) {
              score ++;
              stop1 = true;
            }
            }
          }
        for(int i = 0; i < str.length() - 2; i++) {
          if (i != 0 && i < str.length() - 1) {
            if (str.charAt(i) == str.charAt(i + 2) && !stop2) {
              score ++;
              stop2 = true;
            }
            }
          }

        if (score == 2) {
          total2++;
        }
      }
    } catch (FileNotFoundException ex) {

    }
System.out.println("" + total2);
}
}
}
