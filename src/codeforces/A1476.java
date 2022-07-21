package codeforces;

import java.util.Scanner;

public class A1476 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		long[] ans = new long[t];
		for (int i = 0; i < t; i++) {
			long n = scanner.nextLong();
			long k = scanner.nextLong();
			if (k>= n) {
				ans[i] = (long)Math.ceil(k*1.0/n);
			}else {
				k = (long)Math.ceil(n*1.0/k) * k;
				ans[i] = (long)Math.ceil(k*1.0/n);
			}
		}
		scanner.close();
		//Output
		for (long i: ans) System.out.println(i);
	}
}
