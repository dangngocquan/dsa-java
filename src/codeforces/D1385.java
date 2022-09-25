package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1385/D"> Link </a>
 * @author Bris
 * @since 9:29:42 PM - Sep 23, 2022
 *
 */
public class D1385 {
	public static int countChar(String s, char c) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			count += (s.charAt(i) != c)? 1 : 0;
		}
		return count;
	}
	
	public static int solve(String s, char c) {
		if (s.length() == 1) {
			return (s.charAt(0) == c)? 0 : 1;
		}
		int ans1 = countChar(s.substring(0, s.length()/2), c) + solve(s.substring(s.length()/2), (char)(c+1));
		int ans2 = countChar(s.substring(s.length()/2), c) + solve(s.substring(0, s.length()/2), (char)(c+1));
		return Math.min(ans1, ans2);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			String s = scanner.next();
			System.out.println(solve(s, 'a'));
		}
		scanner.close();
	}
}
