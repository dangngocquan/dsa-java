package codeforces;

import java.util.Scanner;

public class A1525 {
	static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a%b);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int e = scanner.nextInt();
			System.out.println(100/gcd(e, 100));
		}
		scanner.close();
	}
}
