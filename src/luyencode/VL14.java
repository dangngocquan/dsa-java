package luyencode;

import java.util.Scanner;

public class VL14 {
	static int gcd(int a, int b) {
		if (b==0) return a;
		return gcd(b,a%b);
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int a = Math.abs(scanner.nextInt());
		int b = Math.abs(scanner.nextInt());
		scanner.close();
		//Output
		System.out.println(gcd(a, b));
	}
}
