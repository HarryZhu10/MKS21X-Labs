public class SuperArray {

private String[] data;
private int size;

public SuperArray() {
 data = new String[10];
  size = 0;
}

public int size() {
  return size;
}

public SuperArray(int initialCapacity) {
   data = new String[initialCapacity];
}

public boolean add(String x) {
  if (size == data.length) {
    resize();
  }
  data[size] = x;
  size ++;
  return true;
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

public String get(int index) {
  if (index < 0 || index >= size) {
    System.out.println("error");
    return "null";
  }
  return "" + data[index];
}

public String set(int index, String element) {
  String copy = data[index];
  if (index >= size || index < 0) {
    System.out.println("error");
    return "null";
  }
  data[index] = element;
  return copy;
}
private void resize() {
  String[] newArray = new String[2 * data.length + 1];
  for (int i = 0; i < size; i ++) {
    newArray[i] = data[i];
  }
  data = newArray;
}

}
