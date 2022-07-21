package codeforces;

import java.util.Scanner;

public class B1409 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		long[] ans = new long[t];
		for (int i = 0; i < t; i++) {
			long a = scanner.nextLong();
			long b= scanner.nextLong();
			long x = scanner.nextLong();
			long y = scanner.nextLong();
			long n = scanner.nextLong();
			if (a < b) {
				a += b;
				b = a -b;
				a = a-b;
				x += y;
				y = x- y;
				x = x- y;
			}
			if (a+b-x-y <= n) {
				ans[i] = x*y;
			}else {
				long aMin = a - Math.min(n, a-x);
				long bMin = b - Math.min(n, b - y);
				ans[i] += Math.min(aMin*(a+b-n-aMin), bMin*(a+b-n-bMin));
			}
		}
		scanner.close();
		//Output
		for (long i : ans) System.out.println(i);
	}
}
