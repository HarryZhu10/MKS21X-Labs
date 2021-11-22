import java.util.Scanner;
import java.util.ArrayList;
public class UserInput {
  public static void main (String[] args) {
    ArrayList<Double>container = new ArrayList<Double>();
    Scanner negative = new Scanner(System.in);
    System.out.println("Enter a non negative number. A negative number will end the program:");
    while (negative.nextDouble() > 0) {
      container.add(negative.nextDouble());
      System.out.println("Enter a non negative number. A negative number will end the program:");   //Ask how to fix the issues of having to give two inputs before it prints this
    }

  String str = "[";
  for (int i = 0; i < container.size(); i ++) {
    if (i < container.size() - 1) {
      str = str + container.get(i) + ", ";
    } else {
      str = str + container.get(i) + "]";
    }
  }
  System.out.println("You entered: " + str);

    double mean = 0.0;
  for (int i = 0; i < container.size(); i ++) {
    mean += container.get(i);
  }
  System.out.println(mean / container.size() + "");


double min = container.get(0);
double max = 0.0;

for (int i = 0; i < container.size(); i ++) {
  if (container.get(i) > max) {
    max = container.get(i);
  }
  if (container.get(i) < min) {
    min = container.get(i);
  }
}
System.out.println("Min value: " + min);
System.out.println("Max value: " + max);
}
}
