
public class Driver {
  public static void main(String args[]){
    SuperArray SA = new SuperArray();
    SA.add("Fish");
    //displaying elements
    System.out.println(SA);
    System.out.println(SA.toStringDebug());

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
  }
}
