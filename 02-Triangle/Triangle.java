public class Triangle {

private Point v1,v2,v3;

public Triangle(Point P1, Point P2, Point P3) {
  v1 = P1;
  v2 = P2;
  v3 = P3;
}

public Triangle(double Ax, double Ay, double Bx, double By, double Cx, double Cy) {
  v1 = new Point(Ax,Ay);
  v2 = new Point(Bx,By);
  v3 = new Point(Cx,Cy);
}


public double getPerimeter() {
  return Point.distance(v1,v2) + Point.distance(v2, v3) + Point.distance(v3, v1);
}


public Point getVertex(int x) {
  if (x == 1) {
    return v1;
  }
  if (x == 2) {
    return v2;
  }
  if (x == 3) {
    return v3;
  }
  return new Point(0,0);
}

public void setVertex(int n, Point p) {
  if (n==1){
      v1 = p;
    }
    if (n==2){
      v2 = p;
    }
    if (n==3){
      v3 = p;
    }
}

public String toString() {
  return "{" + v1 + ", " + v2 + ", " + v3 + "}";
}



}
