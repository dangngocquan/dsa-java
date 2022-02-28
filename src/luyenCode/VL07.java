package luyenCode;

import java.util.Scanner;

public class VL07 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		long k = scanner.nextLong();
		scanner.close();
		//Solve
		double ans = 1;
		k = Math.min(k, n-k);
		for (long i = 1; i <= k; i++) {
			ans *= (n-k+i)*1.0/i;
		}
		//Output
		System.out.println((long)ans);
	}
}
