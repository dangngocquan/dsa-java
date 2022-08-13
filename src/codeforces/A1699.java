package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1699/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 11:23:53 PM -  Aug 7, 2022
 */
public class A1699 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			if (n % 2 == 0) {
				int a = (n/2) ^ 1;
				System.out.println(a + " 1 1");
			}else {
				System.out.println(-1);
			}
		}
		scanner.close();
	}
}
