package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1555/A"> Link </a>.
 * @author Bris
 * @version 1.0
 * @since 9:27:57 PM -  Apr 4, 2022
 */
public class A1555 {
	/**
	 * The main method.
	 * @param args Unused.0
	 * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			long n = scanner.nextLong();
			if (n < 6) {
				System.out.println(15);
			}else {
				if (n % 2 == 0) {
					System.out.println((long)(n*5/2));		
				}else {
					System.out.println((long)((n+1)*5/2));
				}
			}
		}
		scanner.close();
	}
}
