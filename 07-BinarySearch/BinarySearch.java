import java.util.Arrays;
public class BinarySearch {
  public static int binarySearch(int[] data,int target){
  int[] sortedData = data;
  Arrays.sort(sortedData);
  int maxIndex = data.length - 1;
  int minIndex = 0;
  int middle = (maxIndex + minIndex) / 2;

  while (min <= max) {
    if (target == data[middle]) {
      return middle;
    }
    if (target > data[middle]) {
      minIndex = middle + 1;
      middle = (maxIndex + minIndex) / 2;
    }
    if (target < data[middle]) {
      maxIndex = middle - 1;
      middle = (maxIndex + minIndex) / 2;
    }
  }
  return -1;

  }

  public static void main (String[] args) {
    int[] data = {2,3,5,1,2,22};
    int[] test = data;
    Arrays.toString(test);
    System.out.println(Arrays.toString(test));
  }

}
