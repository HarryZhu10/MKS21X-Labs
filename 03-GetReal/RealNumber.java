public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  /*
  *Return the sum of this and the other
  */
  public double add(RealNumber other){

     //other can be ANY RealNumber, including a RationalNumber

     //or other subclasses of RealNumber (that aren't written yet)

     return other.value + value;
  }

  /*
  *Return the product of this and the other
  */
  public double multiply(RealNumber other){
    return value * other.value;
  }

  /*
  *Return the this divided by the other
  */
  public double divide(RealNumber other){
    return value / other.value;
  }

  /*
  *Return the this minus the other
  */
  public double subtract(RealNumber other){
    return value - other.value;
  }


  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+value;
  }

public int compareTo(RealNumber other) {
  if (value > other.value) {
    return 1;
  } else if (value < other.value) {
    return -1;
  } else {
    return 0;
  }
}

public boolean equals(RealNumber other) {
  if (getValue() == other.getValue()) {
    return true;
  }
  return false;
}
}
