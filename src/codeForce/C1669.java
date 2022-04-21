package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1669/problem/C"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:51:06 PM -  Apr 21, 2022
 */
public class C1669 {
	/**
	 * The main method.
	 * @param args .
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
			}
			String ans = "YES";
			for (int i = 2; i < n; i += 2) {
				if ((a[i] - a[i-2]) % 2 != 0) {
					ans = "NO";
					break;
				}
			}
			for (int i = 3; i < n; i += 2) {
				if ((a[i] - a[i-2]) %2  != 0) {
					ans = "NO";
					break;
				}
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
