package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1690/problem/C"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 8:00:12 PM -  Jul 16, 2022
 */
public class C1690 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int[] s = new int[n];
			int[] f = new int[n];
			for (int i = 0; i < n; i++) {
				s[i] = scanner.nextInt();
			}
			for (int i = 0; i < n; i++) {
				f[i] = scanner.nextInt();
			}
			
			int time = s[0];
			for (int i = 0; i < n; i++) {
				if (s[i] > time) {
					time = s[i];
				}
				System.out.print(f[i] - time + " ");
				time = f[i];
			}
			System.out.println();
		}
		scanner.close();
	}
}
