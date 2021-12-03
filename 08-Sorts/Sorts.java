import java.util.Arrays;
public class Sorts {
  public static void main (String[] args) {
    int[] messyList = {3,2,1,5,5,1};
    bubbleSort(messyList);
    int[] sortedList = {1,1,2,3,5,5};
    System.out.println(Arrays.toString(messyList) + " should be the same as " + Arrays.toString(sortedList));
    System.out.println("" + minVal(messyList));
  }

/* Bubble Sort
*/

  public static void bubbleSort(int[] data) {
  for (int x = data.length;x >= 0;x --) {
    for (int i = 0; i < x - 1; i ++) {
      int save = 0;
      if (data[i] > data[i + 1]) {
        save = data[i];
        data[i] = data[i + 1];
        data[i + 1] = save;
      }
    }
  }
  }

/*
Find Minimum value method
*/

public static int minVal(int[] ary, int index) {
  int min = ary[0];
  for (int i = index; i < ary.length; i ++) {
    if (ary[i] < min) {
      min = ary[i];
    }
  }
  return min;
}


  /*Selection sort
   */

  public static void selectionSort(int [] ary) {
    int start = 0
    for(int i = 0; i < ary.length; i ++) {
      
    }
  }

}
