import java.util.Scanner;
import java.io.File;
import java.util.Arrays;
import java.io.FileNotFoundException;
public class Triangles {


public static void main(String[] args) {
  File argFile = new File(args[0]);
  if (Integer.parseInt(args[1]) == 1) {
    try {
      File file = new File("Test.txt");
      Scanner check = new Scanner(file);
      int count = 0;
      while (check.hasNextInt()) {
        int side1 = check.nextInt();
        int side2 = check.nextInt();
        int side3 = check.nextInt();
        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
          count ++;
          check.nextLine();
        }
      }
      check.close();
      System.out.println("" + count);
    } catch (FileNotFoundException ex) {
          System.out.println("File not found");
        }

      }

if (Integer.parseInt(args[1]) == 2) {
  try{
    File file = new File("Test.txt");
    Scanner check = new Scanner(file);
    int count = 0;
    while ()

  } catch (FileNotFoundException ex) {
         System.out.println("File not found");
     }



}
}
}
