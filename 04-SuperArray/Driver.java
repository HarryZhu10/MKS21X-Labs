
public class Driver {
  public static void main(String args[]){
    SuperArray SA = new SuperArray();
    SuperArray Test1 = new SuperArray(4);
    SA.add("Fish");
    //displaying elements
    System.out.println(SA);
    System.out.println(SA.toStringDebug());

//Testing

    SA.add("Cat");
    //displaying elements
    System.out.println(SA);
    System.out.println(SA.toStringDebug());

    SA.add("Dog");
    SA.add("Pig");
    SA.add("Cow");
    //displaying elements
    System.out.println(SA);
    System.out.println(SA.toStringDebug());
    System.out.println(SA.get(2));
    System.out.println(SA.get(11));
    System.out.println(SA.get(6));
    System.out.println(SA.set(1,"Test"));
    System.out.println(SA);

    System.out.println(Test1.toStringDebug());
    Test1.add("Hello");
    Test1.add("Is");
    Test1.add("This");
    Test1.add("Code");
    Test1.add("working?");
    System.out.println(Test1.toStringDebug());
    Test1.remove(2);
    System.out.println(Test1.toStringDebug());
    Test1.remove(3);
    System.out.println(Test1.toStringDebug());
  }
}
