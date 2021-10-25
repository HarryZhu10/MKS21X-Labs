public class Demo{
  /* more methods can go here*/

public static double distance(Point P1, Point P2) {
  return Math.sqrt((P1.getX() - P2.getX()) * ((P1.getX() - P2.getX())) + ((P1.getY() - P2.getY())) * ((P1.getY() - P2.getY())));
}



  public static void main(String[]args){
    Point P1 = new Point(0,0);
    Point P2 = new Point(3,4);

    System.out.println(  distance(P1,P2)); //call1
//    System.out.println(  Point.distance(P1,P2)); //call 2
//    System.out.println(  P1.distanceTo(P2)); //call 3
    //This one is IMPLIED strongly. You cannot tell by the calling style alone,
    //but you can make an educated guess.
  }
 }
