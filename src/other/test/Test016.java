package other.test;

public class Test016 {
	public static void main(String[] args) {
		long n = 12345678;
		System.out.format("%d%n", n);
		System.out.format("% d%n", n);
		System.out.format("%+11d%n", n);
		System.out.format("%,15d%n", n);
		System.out.format("%+,15d%n", n);
		
		double pi = Math.PI;
		System.out.format("%f%n", pi);
		System.out.format("%.3f%n", pi);
		System.out.format("%10.3f%n", pi);
		System.out.format("%-10.3f|%n", pi);
		
	}
}
