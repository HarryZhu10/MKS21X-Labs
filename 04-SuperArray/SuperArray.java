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
    throw new IndexOutOfBoundsException ("The index, " + index + " is out of bounds");
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
public String remove(int index) {
  if (index >= data.length) {
    resize();
  }
  String[] newVersion = new String[data.length];
  String copy = data[index];
  for (int i = 0; i < data.length - 1; i ++) {
    if (i >= index) {
      newVersion[i] = data[i + 1];
    } else {
      newVersion[i] = data[i];
    }
  }
  size = size - 1;
  data = newVersion;
  return copy;
}

public int indexOf(String str) {
  for (int i = 0; i < size; i ++) {
    if (str.compareTo(data[i]) == 0) {
      return i;
    }
  }
  return -1;
}

public int lastIndexOf(String str) {
  for (int i = size - 1; i >= 0; i --) {
    if (str.compareTo(data[i]) == 0) {
      return i;
    }
  }
  return -1;
}

public void add(int index, String value) {
  if (index < 0 || index >= size) {
    throw new IndexOutOfBoundsException ("The index, " + index + " is out of bounds");
  }

  if (size + 1 > data.length) {
    resize();
  }
boolean on = true;
  for (int i = size - 1; i >= 1; i --) {
    if (on) {
      data[i + 1] = data[i];
    }
    if (i == index) {
      data[i] = value;
      on = false;
    }
  }
}

public boolean remove(String target) {
  boolean on = false;
  if (indexOf(target) == -1) {
    return false;
  } else {
    for (int i = 0; i < size; i ++) {
      if (indexOf(target) == i) {
        on = true;
      }
      if (on && i != size - 1) {
        data[i] = data[i + 1];
      } else if (i == size - 1) {
        data[i] = "null";
      }
    }
  }
return true;
}

}
