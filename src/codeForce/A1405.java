package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1405/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:50:15 AM -  Jun 25, 2022
 */
public class A1405 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int[] p = new int[n];
			for (int i = 0; i< n; i++) {
				p[i] = scanner.nextInt();
			}
			
			for (int i = n-1; i >= 0; i--) {
				System.out.print(p[i] + " ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
