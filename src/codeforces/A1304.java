package codeforces;

import java.util.Scanner;

/**
 * 
 * This program is used to solve A1304 program in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1304/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 12:47:20 PM -  Mar 21, 2022
 */
public class A1304 {
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if ((y - x) % (a + b) == 0) {
				System.out.println((y-x) / (a+b));
			}else {
				System.out.println(-1);
			}
		}
		scanner.close();
	}
}
