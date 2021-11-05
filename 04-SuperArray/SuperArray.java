public class SuperArray {

private String[] data;
private int size;

public SuperArray() {
  String[] ary = new String[10];
  size = 0;
}

public int size() {
  return size;
}

public void add(String x) {
  ary[size] = x;
  size ++;
}
public String toString() {
  String y = "[";
  for (int i = 0; i < size; i ++) {
    if (i != size - 1) {
      y = y + ary[i] + ", ";
    } else {
      y = y + ary[i];
    }
  }
  return y + "]";
}
}
