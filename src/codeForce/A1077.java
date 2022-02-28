package codeForce;

import java.util.Scanner;

public class A1077 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		long[] ans = new long[t];
		for (int i = 0; i < t; i++) {
			long a = scanner.nextLong();
			long b = scanner.nextLong();
			long k = scanner.nextLong();
			ans[i] = (k/2)*(a-b);
			if (k%2 ==1) ans[i] += a;
		}
		scanner.close();
		//Output
		for (long i : ans) System.out.println(i);
	}
}
