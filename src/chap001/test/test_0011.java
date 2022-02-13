package chap001.test;

import java.util.Scanner;

public class test_0011 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		long[] ans = new long[t];
		for (int i = 0; i < t; i++) {
			long n = scanner.nextLong();
			long k = 5;
			while (k <= n) {
				ans[i] += n/k;
				k *= 5;
			}
		}
		scanner.close();
		//Output
		for (long i: ans) System.out.println(i);
	}
}
