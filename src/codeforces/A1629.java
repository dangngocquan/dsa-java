package codeforces;

import java.util.Scanner;

public class A1629 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] ans = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			for (int j = 0; j < n; j++) a[j] = scanner.nextInt();
			for (int j = 0; j < n; j++) b[j] = scanner.nextInt();
			for (int j = 0; j < n-1; j++) {
				for (int m = 0; m < n-1; m++) {
					if (a[m] > a[m+1]) {
						a[m] += a[m+1];
						a[m+1] = a[m] - a[m+1];
						a[m] -= a[m+1];
						b[m] += b[m+1];
						b[m+1] = b[m] - b[m+1];
						b[m] -= b[m+1];
					}
				}
			}
			ans[i] = k;
			for (int j = 0; j < n; j++) {
				if (a[j] <= ans[i]) {
					ans[i] += b[j];
				}else {
					break;
				}
			}
		}
		scanner.close();
		//Output
		for (int i : ans) System.out.println(i);
	}
}
