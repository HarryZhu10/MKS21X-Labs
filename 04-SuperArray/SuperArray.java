public class SuperArray {

private String[] data;
private int size;

public SuperArray() {
  String[] data = new String[10];
  size = 0;
}

public int size() {
  return size;
}

public void add(String x) {
  data[size] = x;
  size ++;
}
public String toString() {
  String y = "[";
  for (int i = 0; i < size; i ++) {
    if (i != size - 1) {
      y = y + data[i] + ", ";
    } else {
      y = y + data[i];
    }
  }
  return y + "]";
}

public String toStringDebug() {
  String y = "[";
  for (int i = 0; i < data.length; i ++) {
    if (i != data.length - 1) {
      y = y + data[i] + ", ";
    } else {
      y = y + data[i];
    }
  }
  return y + "]";
}

}
