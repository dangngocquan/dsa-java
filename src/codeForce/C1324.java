package codeForce;

import java.util.Scanner;

/**
 * 
 * <a href = "https://codeforces.com/problemset/problem/1324/C"> Link </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 2:46:11 PM -  Mar 25, 2022
 */
public class C1324 {
	/**
	 * 
	 * ...
	 * 
	 * @param s ...
	 * @param d ...
	 * @return ...
	 */
	public static boolean canSolve(String s, int d) {
		for (int i = 0; i <= s.length() - d; i++) {
			boolean isAllL = true;
			for (int j = i; j < i + d; j++) {
				if (s.charAt(j) == 'R') {
					isAllL = false;
					break;
				}
			}
			if (isAllL) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 
	 * The main method
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			String s = scanner.next();
			int length = s.length();
			for (int d = 1; d <= s.length() + 1; d++) {
				if (canSolve(s, d)) {
					System.out.println(d);
					break;
				}
			}
		}
	}
}
