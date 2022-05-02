package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1674/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:36:42 PM -  May 2, 2022
 */
public class A1674 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			
			if (y % x == 0) {
				System.out.println("1 "+ y / x);
			}else {
				System.out.println("0 0");
			}
		}
		scanner.close();
	}
}
