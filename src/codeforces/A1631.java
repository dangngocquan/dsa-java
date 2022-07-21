package codeforces;

import java.util.Scanner;

public class A1631 {
	static int[] getMax(int[] a, int n) {
		int[] ans = new int[2];
		for (int i = 0; i < n; i++) {
			if (a[i] > ans[0]) {
				ans[0] = a[i];
				ans[1] = i;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] ans = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			for (int j = 0; j < n; j++) a[j] = scanner.nextInt();
			for (int j = 0; j < n; j++) b[j] = scanner.nextInt();
			int[] a1 = getMax(a, n);
			int[] b1 = getMax(b, n);
			if (a1[0] >= b1[0]) {
				for (int j = 0; j < n; j++) {
					if (b[j] > a[j]) {
						a[j] += b[j];
						b[j] = a[j] - b[j];
						a[j] = a[j] - b[j];
					}
				}
				ans[i] = a1[0]*getMax(b, n)[0];
			}else {
				for (int j = 0; j < n; j++) {
					if (a[j] > b[j]) {
						a[j] += b[j];
						b[j] = a[j] - b[j];
						a[j] = a[j] - b[j];
					}
				}
				ans[i] = b1[0]*getMax(a, n)[0];
			}
		}
		scanner.close();
		//Output
		for (int i : ans) System.out.println(i);
	}
}
