package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class A1473 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] res = new String[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int d = scanner.nextInt();
			int[] a = new int[n];
			for (int j = 0; j < n; j++) a[j] = scanner.nextInt();
			Arrays.sort(a);
			if (a[n-1] <= d) {
				res[i] = "YES";
			}else {
				if (a[0] + a[1] <= d) {
					res[i] = "YES";
				}else {
					res[i] = "NO";
				}
			}
		}
		scanner.close();
		//Output
		for (String i : res) System.out.println(i);
	}
}
