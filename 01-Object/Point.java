public class Point{
  private double x,y;
  public Point(double X, double Y){
    x=X;
    y=Y;
  }
  public Point(Point p){
    x= p.x;
    y= p.y;
  }
  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }

public static double distance(Point P1, Point P2) {
return Math.sqrt((P1.getX() - P2.getX()) * ((P1.getX() - P2.getX())) + ((P1.getY() - P2.getY())) * ((P1.getY() - P2.getY())));

}

}
