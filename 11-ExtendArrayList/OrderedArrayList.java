import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public OrderedArrayList () {
    super();
  }

  public OrderedArrayList (int startingCapacity) {
    super(startingCapacity);
  }


  private int whereToPlace(T value){
        /*return the index that the value should be placed
        when inserting into the OrderedArrayList .*/

        //Ask if we need to consider that the list may have a length of 2
        if (value == null) {
          return 0;
        }

        for (int i = size() - 1; i >= 0; i --) {
          if (i != 0 && i != size() - 1) {
          if (value.compareTo(get(i - 1)) >= 0 && value.compareTo(get(i + 1)) <= 0) {
            return i;
          }
        } else if (i == size() - 1) {
          if (value.compareTo(get(i)) >= 0) {
            return i;
          }
        } else if (i == 0) {
          if (value.compareTo(get(i)) <= 0) {
            return i;
          }
        }
        }
        return -1;
      }

      public boolean add(T element) {
        super.add(whereToPlace(element), element);
        return true;
      }

      public void add(int index, T element) {
        add(element);
      }
      public T set(int index, T element) {
        T save = super.remove(index);
        add(element);
        return save;
      }
}
