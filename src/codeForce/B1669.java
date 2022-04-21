package codeForce;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1669/problem/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:40:44 PM -  Apr 21, 2022
 */
public class B1669 {
	/**
	 * The main method
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
			Arrays.sort(a);
			if (n < 3) {
				System.out.println(-1);
				continue;
			}
			int ans = -1;
			for (int i = 0; i < n-2; i++) {
				if (a[i] == a[i+1] && a[i+1] == a[i+2]) {
					ans = a[i];
					break;
				}
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
