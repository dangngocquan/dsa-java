package codeforces;

import java.util.Scanner;

public class A1638 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] ans = new String[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int l = -1;
			int r = -1;
			int min = n+1;
			int[] a = new int[n+1];
			for (int j = 1; j <= n; j++) {
				a[j] = scanner.nextInt();
				if (a[j] > j && l==-1) {
					l = j;
					min = a[j];
				}
				if (l != -1) {
					if (a[j] < min) {
						min = a[j];
						r = j;
					}
				}
			}
			ans[i] = "";
			if (l == -1) {
				for (int j = 1; j <= n; j++) ans[i] += j +" ";
			}else {
				for (int j = 1; j < l; j++) ans[i] += a[j]+" ";
				for (int j = r; j >= l; j--) ans[i] += a[j]+" ";
				for (int j = r+1; j <= n; j++) ans[i] += a[j]+" ";
			}
		}
		scanner.close();
		//Output
		for (String i : ans) System.out.println(i);
	}
}
