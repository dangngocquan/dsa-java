package codeforces;

import java.util.Scanner;

public class A1646 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		long[] ans = new long[t];
		for (int i = 0; i < t; i++) {
			long n = scanner.nextLong();
			long s = scanner.nextLong();
			ans[i] = s/(n*n);
		}
		scanner.close();
		//Output
		for (long i : ans) System.out.println(i);
	}
}
