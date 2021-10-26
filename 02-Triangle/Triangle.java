public class Triangle {

private Point v1,v2,v3;

public Triangle(Point P1, Point P2, Point P3) {
  v1 = P1;
  v2 = P2;
  v3 = P3;
}

public Triangle(double Ax, double Ay, double Bx, double By, double Cx, double Cy) {

}


public double getPerimeter() {
  return distanceTo(v1,v2) + distanceTo(v2, v3) + distanceTo(v3, v1);
}
















}
