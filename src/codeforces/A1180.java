package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1180/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:26:49 AM -  Jun 25, 2022
 */
public class A1180 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		int ans = 1 + 4* (n * (n-1) / 2);
		System.out.println(ans);
	}
}
