public class RealNumber extends Number {
  private double value;

  public RealNumber(double v) {
    value = v;
  }

  public double getValue() {
    return value;
  }

  public String toString() {
    return ""+getValue();
  }
  //---------ONLY EDIT BELOW THIS LINE------------

  /*
  *Return true when the values are within 0.001% of eachother.
  *Special case: if one is exactly zero, the other must be exactly zero.
  */
  public boolean equals(RealNumber other) {
    if (value == 0 || other.value == 0) {
      if (value == other.value) {
        return true;
      }
      return false;
    }
    if (Math.abs( (value - other.value) / value) <= 0.00001 ) {
      return true;
    }
    return false;
  }

  /*
  *Return a new RealNumber that has the value of:
  *the sum of this and the other
  */
  public RealNumber add(RealNumber other) {
     RealNumber k = new RealNumber(value + other.value);
     return k;
  }

  /*
  *Return a new RealNumber that has the value of:
  *the product of this and the other
  */
  public RealNumber multiply(RealNumber other) {
    RealNumber k = new RealNumber(value * other.value);
    return k;
  }

  /*
  *Return a new RealNumber that has the value of:
  *this divided by the other
  */
  public RealNumber divide(RealNumber other) {
    RealNumber k = new RealNumber(value / other.value);
    return k;
  }

  /*
  *Return a new RealNumber that has the value of:
  *this minus the other
  */
  public RealNumber subtract(RealNumber other) {
    RealNumber k = new RealNumber(value - other.value);
    return k;
  }
}