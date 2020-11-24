public class Tester {
	public static void main(String[] args) {
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

	}
}