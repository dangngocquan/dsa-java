package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/766/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 1:04:04 AM -  Jun 25, 2022
 */
public class A766 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.next();
		String s2 = scanner.next();
		scanner.close();
		
		int ans = -1;
		
		if (s1.length() != s2.length()) {
			ans = Math.max(s1.length(),s2.length());
		}else {
			if (!s1.equals(s2)) {
				ans = s1.length();
			}
		}
		
		System.out.println(ans);
	}
}
