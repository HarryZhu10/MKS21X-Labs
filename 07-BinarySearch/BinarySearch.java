import java.util.Arrays;
public class BinarySearch {
  public static int binarySearch(int[] data,int target){
  int[] sortedData = data;
  Arrays.sort(sortedData);
  int maxIndex = data.length - 1;
  int minIndex = 0;
  int middle = (maxIndex + minIndex) / 2;

  while (minIndex <= maxIndex) {
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
    int[] 
    int[] data = {2,3,5,1,2,22};
    System.out.println(binarySearch(data, 3));
    System.out.println(binarySearch(data, 7));
    System.out.println(binarySearch(data, 2));
    System.out.println(binarySearch(data, 22));
    int result;
result = binarySearch(new int[]{0,0,0,0,0,0,0},0);
System.out.println(result);//should be 3
result = binarySearch(new int[]{0,0,0,0,0,0,0},1);
System.out.println(result);//should be -1

result = binarySearch(new int[]{0,1,2,3,4,5,6},0);
System.out.println(result);//should be 0
//...
result = binarySearch(new int[]{0,1,2,3,4,5,6},6);
System.out.println(result);//should be 6
//Tip: You can use a loop to find if it works on 0,1,2,3,4,5,and 6 in this array!
  }

}
