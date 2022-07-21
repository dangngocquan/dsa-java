package codeforces;

import java.util.Scanner;

public class A1519 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] ans = new String[t];
		for (int i = 0; i < t; i++) {
			long r = scanner.nextLong();
			long b = scanner.nextLong();
			long d = scanner.nextLong();
			long min = Math.min(r, b);
			long max = Math.max(r, b);
			if ((max-min) <= min*d) {
				ans[i] = "YES";
			}else {
				ans[i] = "NO";
			}
		}
		scanner.close();
		//Output
		for (String i : ans) System.out.println(i);
	}
}
