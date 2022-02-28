package codeForce;

import java.util.Scanner;

public class A1366 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		long[] ans = new long[t];
		for (int i = 0; i < t; i++) {
			long a = scanner.nextLong();
			long b = scanner.nextLong();
			long x = Math.min(a, b);
			long y = Math.max(a, b);
			if (y >= 2*x) {
				ans[i] = x;
			}else {
				ans[i] = y-x;
				y = y - 2*ans[i];
				x = x - ans[i];
				ans[i] += (x+y)/3;
			}
		}
		scanner.close();
		//Output
		for (long i: ans) System.out.println(i);
	}
}
