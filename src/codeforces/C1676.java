package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1676/problem/C"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:17:42 AM -  Jun 25, 2022
 */
public class C1676 {
	public static int getDifference(String s1, String s2, int length) {
		int ans = 0;
		for (int i = 0; i < length; i++) {
			ans += Math.abs(s1.charAt(i) - s2.charAt(i));
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			String[] s = new String[n];
			for (int i = 0; i < n; i++) {
				s[i] = scanner.next();
			}
			
			int ans = Integer.MAX_VALUE;
			for (int i = 0; i < n-1; i++) {
				for (int j = i+1; j < n; j++) {
					ans = Math.min(getDifference(s[i], s[j], m), ans);
				}
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
