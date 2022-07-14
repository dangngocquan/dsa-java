package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1594/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 10:37:59 AM -  Jul 14, 2022
 */
public class A1594 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			long n = scanner.nextLong();
			
			System.out.println((-n +1) + " " + n);
		}
		scanner.close();
	}
}
