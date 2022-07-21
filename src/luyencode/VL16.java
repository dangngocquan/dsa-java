package luyencode;

import java.util.Scanner;

public class VL16 {
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
		System.out.println(Math.abs(a*b)/gcd(Math.abs(a),Math.abs(b)));
	}
}
