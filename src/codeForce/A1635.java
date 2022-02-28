package codeForce;

import java.util.Scanner;

public class A1635 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		long[] ans = new long[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			ans[i] = scanner.nextLong();
			for (int j = 1; j < n; j++) ans[i] = ans[i]|scanner.nextLong();
		}
		scanner.close();
		//Output
		for (long i : ans) System.out.println(i);
	}
}