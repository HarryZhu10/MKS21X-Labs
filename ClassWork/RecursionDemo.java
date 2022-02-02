public class RecursionDemo{

public static void makeWords(int size, String ans) {
  if (size > 0) {
    for (char i = 'a'; i <= 'z'; i ++) {
      makeWords(size - 1, ans + i);
    }
  } else {
    System.out.println(ans);
  }
}


public static void main(String[] args) {
  makeWords(2, "");
}



}
