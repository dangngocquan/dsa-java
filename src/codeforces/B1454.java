package codeforces;

import java.util.Scanner;

public class B1454 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] ans = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int[] a = new int[n+1];
			int[] index = new int[n+1];
			for (int j = 1; j <= n; j++) {
				int x = scanner.nextInt();
				a[x]++;
				index[x] = j;
			}
			ans[i] = -1;
			for (int j = 1; j <= n; j++) {
				if (a[j] == 1) {
					ans[i] = index[j];
					break;
				}
			}
		}
		scanner.close();
		//Output
		for (int i : ans) System.out.println(i);
	}
}
