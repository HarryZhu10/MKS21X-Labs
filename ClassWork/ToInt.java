public class ToInt {

  public static int valueOfDigit(char c) {
    return c - 48;
  }
  public static int stringToInt(String s){
       //return the value of Integer.parseInt(s) but do it yourself!
       //Do not use any built in parse methods.
       int start = 0;
       int result = 0;
       if (s.charAt(0) == '-') {
         start ++;
       }
       for (int i = start; i < s.length(); i ++) {
         result = result + math.pow(10, i) * valueOfDigit(s.charAt(i));
       }

       if (s.charAt(0) == '-') {
         result = result * -1;
       }
       return result;
     }
}
