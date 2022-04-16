package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1514/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:24:59 AM -  Apr 16, 2022
 */
public class A1514 {
	/**
	 * The main method.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			String ans = "NO";
			while (n-->0) {
				int num = scanner.nextInt();
				if ((int)Math.sqrt(num) * (int) Math.sqrt(num) != num) {
					ans = "YES";
				}
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
