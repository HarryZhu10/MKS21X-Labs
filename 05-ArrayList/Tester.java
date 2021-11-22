import java.util.ArrayList;
public class Tester{
public static void main(String[] args) {
  ArrayList<String>data = new ArrayList<String>(300000);
boolean determineBoolean = true;
    for(int i = 0; i < 250000; i++){
      data.add(Math.random() * 300000 + "");
    }
  ArrayList<String>test1 = ArrayListPractice.replaceEmpty(data);
    for (int x = 0; x < 300000; x ++) {
      if (x < 250000) {
        if (!((data.get(x)).equals(test1.get(x)))) {
          determineBoolean = false;
        }
      } else {
        if (!((data.get(x)).equals("Empty"))) {
          determineBoolean = false;
        }
      }
    }
System.out.println("" + determineBoolean);
}
}
