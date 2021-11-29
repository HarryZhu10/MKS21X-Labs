import java.util.Scanner;
import java.io.File;
import java.util.Arrays;
import java.io.FileNotFoundException;
public class Wrapping {
  public static void main(String[] args) {
    File argFile = new File(args[0]);
    int totalAmount = 0;
    int totalAmount2 = 0;
    if (Integer.parseInt(args[1]) == 1) {
    try {
      Scanner in = new Scanner(argFile);
      while (in.hasNextLine()) {
        String[] nums = in.nextLine().split("x");
        int length = Integer.parseInt(nums[0]);
        int width = Integer.parseInt(nums[1]);
        int height = Integer.parseInt(nums[2]);
        int minArea = length * width;

        if (length * height < minArea) {
          minArea = length * height;
        }

        if (width * height < minArea) {
          minArea = width * height;
        }

        totalAmount = totalAmount + 2 * width * height + 2 * length * height + 2 * width * length + minArea;
      }
      in.close();
    } catch (FileNotFoundException ex) {

    }
    System.out.println("" + totalAmount);
  }

  if (Integer.parseInt(args[1]) == 2) {
    try {
      Scanner in = new Scanner(argFile);
      while (in.hasNextLine()) {
        String[] nums = in.nextLine().split("x");
        int length = Integer.parseInt(nums[0]);
        int width = Integer.parseInt(nums[1]);
        int height = Integer.parseInt(nums[2]);
        int minPerimeter = 2 * (length + width);

        if (2 * (length + height) < minPerimeter) {
          minPerimeter = 2 * (length + height);
        }

        if (2 * (height + width) < minPerimeter) {
          minPerimeter = 2 * (height + width);
        }

        totalAmount2 = totalAmount2 + minPerimeter + length * width * height;

      }
      in.close();
    } catch (FileNotFoundException ex) {

    }
    System.out.println("" + totalAmount2);
  }


  }



}
