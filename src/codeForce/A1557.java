package codeForce;

import java.util.Arrays;
import java.util.Scanner;

public class A1557 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		double[] ans = new double[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			long[] a = new long[n];
			for (int j = 0; j < n; j++) a[j] = scanner.nextLong();
			Arrays.sort(a);
			for (int j = 0; j < n-1; j++) ans[i] += a[j]*1.0;
			ans[i] /= (n-1);
			ans[i] += a[n-1];
		}
		scanner.close();
		//Output
		for (double i : ans) System.out.println(i);
	}
}
