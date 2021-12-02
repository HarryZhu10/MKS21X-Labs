import java.util.Arrays;
public class Sorts {
  public static void main (String[] args) {
    int[] messyList = {3,2,1,5,5,0};
    bubbleSort(messyList);
    int[] sortedList = {0,1,2,3,5,5};
    System.out.println(Arrays.toString(messyList) + " should be the same as " + Arrays.toString(sortedList));
  }


  public static void bubbleSort(int[] data) {
  for (int x = data.length;x <= data.length;x --) {
    for (int i = 0; i < x - 1; i ++) {
      int save = 0;
      if (i != x - 2){
      if (data[i] > data[i + 1]) {
        save = data[i];
        data[i] = data[i + 1];
        data[i + 1] = save;
      }
    }
    }
  }
  }
}
