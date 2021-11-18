import java.util.ArrayList;
public class ArrayListPractice{

  public static ArrayList<String> replaceEmpty( ArrayList<String> data){
  //return an new ArrayList that has all of the values of the original ArrayList except
  //that all empty strings are replaced with the word "Empty".
  ArrayList<String> newList = new ArrayList<String>();
  for (int i = 0; i < data.size(); i ++) {
    if (data.get(i) != null) {
      newList.set(i,data.get(i));
    } else {
      newList.set(i,"Empty");
    }
  }
  return newList;
}
public static ArrayList<String> makeReversedList( ArrayList<String> data){
  //return a new ArrayList that is in the reversed order of the parameter.
    ArrayList<String> newList = new ArrayList<String>();
    int count = 0;
    for (int i = data.size() - 1; i >= 0; i --) {
      newList.set(count,data.get(i));
      count++;
    }
    return newList;
}
public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
  //return a new ArrayList that has all values of a and b in alternating order that is:
  //a[0], b[0], a[1], b[1]...
  //when one list is longer than the other, just append the remaining values to the end.
ArrayList<String> newList = new ArrayList<String>(a.size() + b.size());
if (a.size() > b.size()) {
  for (int i = 0; i < a.size(); i ++) {
    newList.add(a.get(i));
    if (i < b.size()) {
      newList.add(b.get(i));
    }
  }
}

if (b.size() > a.size()) {
  for (int i = 0; i < b.size(); i ++) {
    if (i < a.size()) {
      newList.add(a.get(i));
      newList.add(b.get(i));
    } else {
      newList.add(b.get(i));
    }
  }
}


  if (a.size() == b.size()) {
    for (int i = 0; i < a.size(); i ++) {
      newList.add(a.get(i));
      newList.add(b.get(i));
    }
  }

return newList;

}
}
