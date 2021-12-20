import java.util.ArrayList;


public class NoNullArrayList<T> extends ArrayList<T> {

  public NoNullArrayList () {
    super();
  }

  public NoNullArrayList (int startingCapacity) {
    super(startingCapacity);
  }


@Override
  public T set (int index, T element) {
    return super.set(index, element);
  }

@Override
public boolean add(T element) {
  super.add(element);
  return true;
}

@Override
public void add(int index, T element) {
  super.add(index,element);
}
}
