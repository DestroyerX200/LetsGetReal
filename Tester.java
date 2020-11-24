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

		System.out.println();

		
	}
}