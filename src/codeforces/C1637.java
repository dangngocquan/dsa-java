package codeforces;

import java.util.Scanner;

public class C1637 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		long[] ans = new long[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			long[] a = new long[n+1];
			for (int j = 1; j <= n; j++) a[j] = scanner.nextInt();
			if (n==3) {
				if (a[2] %2 == 1) {
					ans[i] = -1;
				}else {
					ans[i] = a[2]/2;
				}
			}else {
				boolean check = true;
				for (int j = 2; j <= n-1; j++) {
					if (a[j] != 1) {
						check = false;
						break;
					}
				}
				if (check) {
					ans[i] = -1;
				}else {
					for (int j = 2; j <= n-1; j++) ans[i] += (a[j]+1)/2;
				}
			}
		}
		scanner.close();
		//Output
		for (long i : ans) System.out.println(i);
	}
}
