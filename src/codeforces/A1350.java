package codeforces;

import java.util.Scanner;

public class A1350 {
	static long getFixNumber(long n) {
		for (long i = 2; i <= Math.sqrt(n); i++) {
			if (n%i == 0) return n+i;
		}
		return n + n;
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		long[] ans = new long[t];
		for (int i = 0; i < t; i++) {
			long n = scanner.nextLong();
			long k = scanner.nextLong();
			ans[i] = getFixNumber(n) + 2*(k-1);
		}
		scanner.close();
		//Output
		for (long i : ans) System.out.println(i);
	}
}
