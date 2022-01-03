public class ToInt {

  public static int valueOfDigit(char c) {
    return c - 48;
  }
  public static int stringToInt(String s){
       //return the value of Integer.parseInt(s) but do it yourself!
       //Do not use any built in parse methods.
       int end = 0;
       int result = 0;
      int power = 0;
       if (s.charAt(0) == '-') {
         end ++;
       }
       for (int i = s.length() - 1; i >= end; i --) {
         result = result + (int) Math.pow(10, power) * valueOfDigit(s.charAt(i));
         power ++;
       }

       if (s.charAt(0) == '-') {
         result = result * -1;
       }
       return result;
     }
}
