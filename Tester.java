public class Tester {
	public static void main(String[] args) {
		System.out.println("\nRealNumber test cases:");
		RealNumber a = new RealNumber(0.000000000100001);
		RealNumber b = new RealNumber(0);
		RealNumber c = new RealNumber(-0.0000000001);
		RealNumber d = new RealNumber(0.0000000001);

		System.out.println(a.equals(b)); // false
		System.out.println(b.equals(a)); // false
		System.out.println(a.equals(c)); // false
		System.out.println(b.equals(c)); // false
		System.out.println(a.equals(a)); // true
		System.out.println(b.equals(b)); // true
		System.out.println(a.equals(d)); // true

		System.out.println("\nadd test cases:");

		RealNumber e = new RealNumber(2);
		RealNumber f = new RealNumber(-1);
		RealNumber g = new RealNumber(5);

		System.out.println(e.add(f)); System.out.println("Should be: " + "1.0");
		System.out.println(e.add(e)); System.out.println("Should be: " + "4.0");
		System.out.println(e.add(g)); System.out.println("Should be: " + "7.0");
		System.out.println(f.add(g)); System.out.println("Should be: " + "4.0");

		System.out.println("\nmultiply test cases:");

		System.out.println(e.multiply(f)); System.out.println("Should be: " + "-2.0");
		System.out.println(e.multiply(e)); System.out.println("Should be: " + "4.0");
		System.out.println(e.multiply(g)); System.out.println("Should be: " + "10.0");
		System.out.println(f.multiply(g)); System.out.println("Should be: " + "-5.0");
		System.out.println(f.multiply(f)); System.out.println("Should be: " + "1.0");

		System.out.println("\ndivide test cases:");

		System.out.println(e.divide(f)); System.out.println("Should be: " + "-2.0");
		System.out.println(e.divide(e)); System.out.println("Should be: " + "1.0");
		System.out.println(e.divide(g)); System.out.println("Should be: " + "0.4");
		System.out.println(f.divide(g)); System.out.println("Should be: " + "-0.2");
		System.out.println(f.divide(f)); System.out.println("Should be: " + "1.0");

		System.out.println("\nsubtract test cases:");

		System.out.println(e.subtract(f)); System.out.println("Should be: " + "3.0");
		System.out.println(e.subtract(e)); System.out.println("Should be: " + "0.0");
		System.out.println(e.subtract(g)); System.out.println("Should be: " + "-3.0");
		System.out.println(f.subtract(g)); System.out.println("Should be: " + "-6.0");
		System.out.println(f.subtract(f)); System.out.println("Should be: " + "0.0");

		System.out.println("\nRationalNumber test cases:");

		RationalNumber a0 = new RationalNumber(1, 2);
		RationalNumber b0 = new RationalNumber(1, 3);
		RationalNumber c0 = new RationalNumber(2, 5);
		RationalNumber d0 = new RationalNumber(7, 0);

		System.out.print(a0.getValue()); System.out.println(" ---> " + "0.5");
		System.out.print(b0.getValue()); System.out.println(" ---> " + "0.33333...");
		System.out.print(c0.getValue()); System.out.println(" ---> " + "0.4");
		System.out.print(d0.getValue()); System.out.println(" ---> " + "0.0");

		System.out.println("\ngetNumerator test cases:");
		System.out.print(a0.getNumerator()); System.out.println(" ---> " + "1");
		System.out.print(b0.getNumerator()); System.out.println(" ---> " + "1");
		System.out.print(c0.getNumerator()); System.out.println(" ---> " + "2");
		System.out.print(d0.getNumerator()); System.out.println(" ---> " + "0");

		System.out.println("\ngetDenominator test cases:");
		System.out.print(a0.getDenominator()); System.out.println(" ---> " + "2");
		System.out.print(b0.getDenominator()); System.out.println(" ---> " + "3");
		System.out.print(c0.getDenominator()); System.out.println(" ---> " + "5");
		System.out.print(d0.getDenominator()); System.out.println(" ---> " + "1");

		System.out.println("\nreciprocal test cases:");
		RationalNumber a1 = a0.reciprocal();
		RationalNumber b1 = b0.reciprocal();
		RationalNumber c1 = c0.reciprocal();
		RationalNumber d1 = d0.reciprocal();

		System.out.print(a1.getNumerator()); System.out.println(" ---> " + "2");
		System.out.print(b1.getNumerator()); System.out.println(" ---> " + "3");
		System.out.print(c1.getNumerator()); System.out.println(" ---> " + "5");
		System.out.print(d1.getNumerator()); System.out.println(" ---> " + "0");

		System.out.print(a1.getDenominator()); System.out.println(" ---> " + "1");
		System.out.print(b1.getDenominator()); System.out.println(" ---> " + "1");
		System.out.print(c1.getDenominator()); System.out.println(" ---> " + "2");
		System.out.print(d1.getDenominator()); System.out.println(" ---> " + "1");

		System.out.println("\nreciprocal test cases:");
		RationalNumber e0 = new RationalNumber(1, 2);
		// RationalNumber f0 = new RationalNumber(2, 4);
		System.out.print(a0.equals(e0)); System.out.println(" ---> " + "true");
		// System.out.print(a0.equals(f0)); System.out.println(" ---> " + "false");
		System.out.print(e0.equals(a0)); System.out.println(" ---> " + "true");
		System.out.print(a0.equals(c0)); System.out.println(" ---> " + "false");

		System.out.println("\nreciprocal test cases:");
		System.out.print(a0); System.out.println(" ---> " + "1/2");
		System.out.print(a1); System.out.println(" ---> " + "2/1");
		System.out.print(b0); System.out.println(" ---> " + "1/3");
		System.out.print(b1); System.out.println(" ---> " + "3/1");
		System.out.print(c0); System.out.println(" ---> " + "2/5");
		System.out.print(c1); System.out.println(" ---> " + "5/2");
		System.out.print(d0); System.out.println(" ---> " + "0/1");
		System.out.print(d1); System.out.println(" ---> " + "0/1");
		System.out.print(e0); System.out.println(" ---> " + "1/2");
		// System.out.print(f0); System.out.println(" ---> " + "2/4");

		// System.out.println("\ngcd test cases");
		// System.out.print(RationalNumber.gcd(45, 9)); System.out.println(" ---> " + "9");
		// System.out.print(RationalNumber.gcd(1001, 5*7*11)); System.out.println(" ---> " + "77");
		// System.out.print(RationalNumber.gcd(-5*7*11, 1001)); System.out.println(" ---> " + "77");
		// System.out.print(RationalNumber.gcd(-60, 150)); System.out.println(" ---> " + "30");
		// System.out.print(RationalNumber.gcd(135, -90)); System.out.println(" ---> " + "45");

		RationalNumber f0 = new RationalNumber(130, 200);
		RationalNumber g0 = new RationalNumber(2*123867123, 15*123867123);
		RationalNumber h0 = new RationalNumber(7*132131, -13*132131);
		System.out.print(f0); System.out.println(" ---> " + "13/20");
		System.out.print(g0); System.out.println(" ---> " + "2/15");
		System.out.print(h0); System.out.println(" ---> " + "-7/13");

		System.out.println("\nmultiply test cases:");
		System.out.print(f0.multiply(g0)); System.out.println(" ---> " + "13/150");
		System.out.print(g0.multiply(h0)); System.out.println(" ---> " + "-14/195");
		System.out.print(f0.multiply(h0)); System.out.println(" ---> " + "-7/20");

		System.out.println("\ndivide test cases:");
		System.out.print(f0.divide(g0)); System.out.println(" ---> " + "39/8");
		System.out.print(g0.divide(h0)); System.out.println(" ---> " + "-26/105");
		System.out.print(f0.divide(h0)); System.out.println(" ---> " + "-169/140");

		System.out.println("\nadd test cases:");
		System.out.print(f0.add(g0)); System.out.println(" ---> " + "47/60");
		System.out.print(g0.add(h0)); System.out.println(" ---> " + "-79/195");
		System.out.print(f0.add(h0)); System.out.println(" ---> " + "29/260");

		System.out.println("\nsubtract test cases:");
		System.out.print(f0.subtract(g0)); System.out.println(" ---> " + "31/60");
		System.out.print(g0.subtract(h0)); System.out.println(" ---> " + "131/195");
		System.out.print(f0.subtract(h0)); System.out.println(" ---> " + "309/260");
	}
}