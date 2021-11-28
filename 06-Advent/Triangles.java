import java.util.Scanner;
import java.io.File;
import java.util.Arrays;
import java.io.FileNotFoundException;
public class Triangles {


public static void main(String[] args) {
  File argFile = new File(args[0]);
  int total = 0;
  int count = 0;
  if (Integer.parseInt(args[1]) == 1) {
    try {
      Scanner check = new Scanner(argFile);
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
    } catch (FileNotFoundException ex) {
          System.out.println("File not found");
        }
        System.out.println("" + count);
      }

if (Integer.parseInt(args[1]) == 2) {
  try{
    Scanner check = new Scanner(argFile);
    while (check.hasNextInt()) {
      int t1S1 = check.nextInt();
      int t2S1 = check.nextInt();
      int t3S1 = check.nextInt();
      int t1S2 = check.nextInt();
      int t2S2 = check.nextInt();
      int t3S2 = check.nextInt();
      int t1S3 = check.nextInt();
      int t2S3 = check.nextInt();
      int t3S3 = check.nextInt();

      if (t1S1 + t1S2 > t1S3 && t1S2 + t1S3 > t1S1 && t1S1 + t1S3 > t1S2) {
        total ++;
      }

      if (t2S1 + t2S2 > t2S3 && t2S2 + t2S3 > t2S1 && t2S1 + t2S3 > t2S2) {
        total ++;
      }

      if (t3S1 + t3S2 > t3S3 && t3S2 + t3S3 > t3S1 && t3S1 + t3S3 > t3S2) {
        total ++;
      }
    }
    check.close();
  } catch (FileNotFoundException ex) {
         System.out.println("File not found");
     }
System.out.println("" + total);


}
}
}
