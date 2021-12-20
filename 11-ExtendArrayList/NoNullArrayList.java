import java.util.ArrayList;


public class NoNullArrayList<T> extends ArrayList<T> {

  public NoNullArrayList () {
    super();
  }

  public NoNullArrayList (int startingCapacity) {
    super(startingCapacity);
  }

public void setValue (T newValue) {
  value
}

@Override
  public T set (int index, T element) {
    super.set(index, element);
    NoNullArrayList<Integer> data = new NoNullArrayList<Integer>();
    data = index;
    return indexOf(data);
  }

@Override
public boolean add(T element) {
  super.add(element);
}

@Override
public void add(int index, T element) {
  super.add(index,element);
}
}
