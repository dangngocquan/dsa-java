package codeforces;

import java.util.Scanner;

public class A1554 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int  t = scanner.nextInt();
		long[] ans = new long[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			long[] a = new long[n];
			a[0] = scanner.nextLong();
			for (int j = 1; j < n; j++) {
				a[j] = scanner.nextLong();
				ans[i] = Math.max(ans[i], a[j]*a[j-1]);
			}
		}
		scanner.close();
		//Output
		for (long i : ans) System.out.println(i);
	}
}
