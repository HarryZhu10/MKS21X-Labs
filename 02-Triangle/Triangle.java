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

public boolean equals(Triangle other) {
  if (v1 != null && v2 != null && v3 != null) {
    return v1.equals(other.v1) && v2.equals(other.v2) && v3.equals(other.v3);
  }
  return false;
}

public String classify() {
  double length1 = Point.distance(v1,v2);
  double length2 = Point.distance(v2,v3);
  double length3 = Point.distance(v3,v1);
  if ((Point.closeEnough(length2,length1)) && (Point.closeEnough(length3,length2))) {
    return "equilateral";
  } else if ((Point.closeEnough(length2,length1)) || (Point.closeEnough(length3,length2)) || (Point.closeEnough(length1,length3))) {
    return "isosceles";
  } else {
    return "scalene";
  }
}

public double area() {
  double a = Point.distance(v1,v2);
  double b = Point.distance(v2,v3);
  double c = Point.distance(v3,v1);

  double s = (a + b + c) / 2;

return Math.sqrt(s * (s - a) * (s - b) * (s - c));

}

}
