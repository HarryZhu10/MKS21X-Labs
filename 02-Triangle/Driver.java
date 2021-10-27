public class Driver {

  public static void main(String args[]) {


    Point P1 = new Point (0,0);
    Point P2 = new Point (3,4);
    Point P3 = new Point (3,4);
    double test0 = 0;
    double test1 = 0;
    double test2 = 5;
    double test3 = 6;
    double test4 = 6.00005;

    System.out.println(P1.getX());
    System.out.println(P1.getY());
    System.out.println(Point.distance(P1,P2));
    System.out.println(P1.toString());
    System.out.println(P2.toString());
    System.out.println(Point.closeEnough(test0,test1));
    System.out.println(Point.closeEnough(test1,test2));
    System.out.println(Point.closeEnough(test2,test3));
    System.out.println(Point.closeEnough(test4,test3));
    System.out.println(P2.equals(P1));
    System.out.println(P2.equals(P3));
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();


  }



}
