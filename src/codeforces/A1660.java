package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1660/problem/0"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:36:06 PM -  Mar 31, 2022
 */
public class A1660 {
	/**
	 * The main method.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while  (t-->0) {
			long a = scanner.nextLong();
			long b = scanner.nextLong();
			long ans;
			if (a == 0) {
				ans = 1;
			}else {
				ans = 2*b + a + 1;
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
