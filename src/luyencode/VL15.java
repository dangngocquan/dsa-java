package luyencode;

import java.util.Scanner;

public class VL15 {
	static int gcd(int a, int b) {
		if (b==0) return a;
		return gcd(b,a%b);
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		//Output
		if (b==0 || Math.abs(a) > 1000 || Math.abs(b) > 1000) {
			System.out.println("INVALID");
		}else if (a %b ==0) {
			System.out.println(a/b);
		}else {
			int x = gcd(Math.abs(a),Math.abs(b));
			a /= x;
			b /= x;
			if (b < 0) {
				a = -a;
				b = -b;
			}
			System.out.println(a + " " + b);
		}
	}
}
