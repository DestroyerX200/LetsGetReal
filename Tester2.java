public class Tester2 {
	public static void main(String[] args) {
		RealNumber a = new RealNumber(0.75);
		RationalNumber b = new RationalNumber(3, 4);
		RealNumber epsilon = new RealNumber(0.00000000001);
		Number c = a.add(epsilon);

		System.out.println("equals test cases:");
		System.out.print(a.equals(b)); System.out.println(" ---> true");
		System.out.print(a.equals(epsilon)); System.out.println(" ---> false");
		System.out.print(a.equals(c)); System.out.println(" ---> true");
	}
}