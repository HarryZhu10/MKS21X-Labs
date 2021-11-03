public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){

    super(0.0);//this value is ignored!
    if (deno == 0) {
      this.numerator = 0;
      this.denominator = 1;
    } else {
    this.numerator = nume;
    this.denominator = deno;
    }
  }

  public double getValue(){
    return (0.0 + numerator) / denominator;
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    return new RationalNumber(denominator,numerator);
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    return numerator == other.numerator && denominator == other.denominator;
  }


  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    return "" + numerator + "/" + denominator;
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
    /*use euclids method or a better one*/
    //http://sites.math.rutgers.edu/~greenfie/gs2004/euclid.html
    int result = 0;
    if (b == 0) {
      a = 0;
      b = 1;
    }
    for (int r = 1; r >= 0; result = r  ) {
      if (a < b) {
      r = a % b;
      a = b;
      b = r;
    } else if (a > b) {
      r = b % a;
      b = a;
      a = r;
    }
    }
    return result;
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    numerator = numerator / gcd(numerator,denominator);
    denominator = denominator / gcd(numerator,denominator);
  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    numerator = numerator * other.numerator;
    denominator = denominator * other.denominator;

    RationalNumber result = new RationalNumber(numerator, denominator);
    result.reduce();
    return result;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    numerator = numerator * other.numerator;
    denominator = denominator * other.denominator;
    RationalNumber result = new RationalNumber(denominator,numerator);
    result.reduce();
    return result;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    numerator = numerator * gcd(numerator,denominator) + other.numerator * gcd(numerator,denominator);
    denominator = denominator * gcd(numerator,denominator) + other.denominator * gcd(numerator,denominator);

    RationalNumber result = new RationalNumber(numerator,denominator);
    result.reduce();
    return result;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    numerator = numerator * gcd(numerator,denominator) - other.numerator * gcd(numerator,denominator);
    denominator = denominator * gcd(numerator,denominator) - other.denominator * gcd(numerator,denominator);
    RationalNumber result = new RationalNumber(numerator,denominator);
    result.reduce();
    return result;
  }
}
