import java.util.Arrays;
public class Sorts {
  public static void main (String[] args) {
    int[] messyList = {3,2,1,5,5,1};
    bubbleSort(messyList);
    int[] sortedList = {1,1,2,3,5,5};
    System.out.println(Arrays.toString(messyList) + " should be the same as " + Arrays.toString(sortedList));
    int[] test2 = {6,5,7,0,6,5};
    System.out.println(Arrays.toString(test2));
    selectionSort(test2);
  }

/*
Bubble Sort
*/

  public static void bubbleSort(int[] data) {
  for (int x = data.length; x >= 0; x --) {
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
  int min = ary[index];
  for (int i = index; i < ary.length; i ++) {
    if (ary[i] < min) {
      min = ary[i];
    }
  }
  return min;
}

/*
Swap method
*/

public static void swap(int[] ary, int index1, int index2) {
  int save = ary[index2];
  ary[index2] = ary[index1];
  ary[index1] = save;
}

public static int aryIndexOf(int[] ary, int start, int target) {
  for (int i = start; i < ary.length; i ++) {
    if (target == ary[i]) {
      return i;
    }
  }
  return -1;
}
  /*Selection sort
   */

  public static void selectionSort(int [] ary) {
    for(int i = 0; i < ary.length; i ++) {
      int min = minVal(ary, i);
      //You might need to add a condition for if i == minVal
      swap(ary, i, aryIndexOf(ary, i, min));
    }
  }

/*
Insertion Sort
*/

public static void insertionSort(int[]data){
  for (int i = 1; i < data.length; i ++) {
    if (data[i] < data[i - 1]) {
      
    }
  }

}

}
