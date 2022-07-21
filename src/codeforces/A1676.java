package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1676/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 2:33:19 PM -  May 12, 2022
 */
public class A1676 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			String s = scanner.next();
			int sum = 0;
			for (int i = 0; i < 3; i++) {
				sum += Integer.parseInt(s.charAt(i) + "");
			}
			for (int i = 3; i < 6; i++) {
				sum -= Integer.parseInt(s.charAt(i) + "");
			}
			System.out.println((sum == 0)? "YES" : "NO");
		}
		scanner.close();
	}
}
