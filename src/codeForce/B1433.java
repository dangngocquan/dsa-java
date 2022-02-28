package codeForce;

import java.util.Scanner;

public class B1433 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] ans = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int index1 = 0;
			int index2 = 0;
			int[] a = new int[n+1];
			for (int j = 1; j <= n; j++) {
				a[j] = scanner.nextInt();
				if (a[j] == 1) {
					if (index1 == 0) index1 = j;
					index2 = j;
				}
			}
			for (int j = index1; j <= index2; j++) {
				if (a[j] == 0) ans[i]++;
			}
		}
		scanner.close();
		//Output
		for (int i : ans) System.out.println(i);
	}
}
