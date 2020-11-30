public class Tester2 {
	public static void main(String[] args) {
		RealNumber a = new RealNumber(0.75);
		RationalNumber b = new RationalNumber(3, 4);
		RealNumber epsilon = new RealNumber(0.00000000001);
		Number c = a.add(epsilon);

		System.out.println("equals() test cases:");
		System.out.print(a.equals(b)); System.out.println(" ---> true");
		System.out.print(a.equals(epsilon)); System.out.println(" ---> false");
		System.out.print(a.equals(c)); System.out.println(" ---> true");

		System.out.println("\ncompareTo() test cases");
		System.out.print(a.compareTo(a)); System.out.println(" ---> 0");
		System.out.print(a.compareTo(b)); System.out.println(" ---> 0");
		System.out.print(a.compareTo(c)); System.out.println(" ---> 0");
		System.out.print(a.compareTo(epsilon)); System.out.println(" ---> 1");
		System.out.print(epsilon.compareTo(b)); System.out.println(" ---> -1");

		RationalNumber d = new RationalNumber(3, 1); 
		RationalNumber e = new RationalNumber(0, -13);
		RationalNumber f = new RationalNumber(3, 0);
		RationalNumber g = new RationalNumber(-13, 1);
		RationalNumber h = new RationalNumber(1, -12);

		System.out.println("\ntoString() test cases");
		System.out.print(d); System.out.println(" ---> 3");
		System.out.print(e); System.out.println(" ---> 0");
		System.out.print(f); System.out.println(" ---> 0");
		System.out.print(g); System.out.println(" ---> -13");
		System.out.print(h); System.out.println(" ---> -1/12");
	}
}