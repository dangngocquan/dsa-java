package codeForce;

import java.util.Scanner;

public class A1490 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] ans = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			for (int j = 0; j < n; j++) a[j] = scanner.nextInt();
			for (int j = 0; j < n-1; j++) {
				int max = Math.max(a[j], a[j+1]);
				int min = Math.min(a[j], a[j+1]);
				while (max*1.0/min > 2) {
					max = (max+1)/2;
					ans[i] += 1;
				}
			}
		}
		scanner.close();
		//Output
		for (int i : ans) System.out.println(i);
	}
}
