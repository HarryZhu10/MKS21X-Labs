import java.util.Scanner;
import java.io.File;
import java.util.Arrays;
import java.io.FileNotFoundException;
public class Triangles {


public static void main(String[] args) {
  try {
    File file = new File("Test.txt");
    Scanner check = new Scanner(file);
    
    while (check.hasNextInt() == true) {
      System.out.println("testing");
    }





} catch (FileNotFoundException ex) {
         System.out.println("File not found");
     }
}

}
