package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1365/B"> Link
 * @author Bris
 * @version 1.0
 * @since 9:31:29 PM -  Apr 15, 2022
 */
public class B1365 {
	/**
	 * The main method.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
			}
			for (int i = 0; i < n; i++) {
				b[i] = scanner.nextInt();
			}
			
			String ans = "Yes";
			for (int i = 0; i < n-1; i++) {
				if (a[i] > a[i+1]) {
					ans = "No";
				}
			}
			
			boolean isFull0 = true;
			boolean isFull1 = true;
			for (int element: b) {
				if (element == 1) {
					isFull0 = false;
				}else {
					isFull1 = false;
				}
			}
			if (!isFull0 && !isFull1) {
				ans = "Yes";
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
