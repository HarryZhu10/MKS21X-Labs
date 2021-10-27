public class Driver {

  public static void main(String args[]) {


    Point P1 = new Point (0,0);
    Point P2 = new Point (3,4);
    Point P3 = new Point (3,4);
    Point P4 = new Point (3,0);
    double test0 = 0;
    double test1 = 0;
    double test2 = 5;
    double test3 = 6;
    double test4 = 6.00005;
    Triangle T1 = new Triangle(P1,P2,P4);
    Triangle T2 = new Triangle (P1, new Point (1,0), new Point (1,1));
    Triangle T3 = new Triangle (P1, new Point (4,0), new Point (2,2 * Math.sqrt(3)));

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
    System.out.println(T1.getPerimeter());
    System.out.println(T1.getVertex(2));
    System.out.println(T1.getVertex(3));
    T1.setVertex(1, new Point (2,2));
    System.out.println(T1.getVertex(1));
    System.out.println(T1.toString());
    Triangle copyT1 = T1;
    System.out.println(T1.equals(copyT1));
    System.out.println(T1.equals(T2));
    T1 = new Triangle(P1,P2,P4);
    System.out.println(T1.classify());
    System.out.println(T2.classify());
    System.out.println(T3.classify());
    System.out.println(T1.area());



  }



}
