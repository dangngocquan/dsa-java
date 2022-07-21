package codeforces;

import java.util.Scanner;

public class A1324 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) a[i] = scanner.nextInt();
			if (n == 1) {
				System.out.println("YES");
				continue;
			}
			String ans = "YES";
			for (int i = 0; i < n-1; i++) {
				if ((a[i] - a[i+1]) %2 != 0) {
					ans = "NO";
					break;
				}
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
