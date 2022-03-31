package codeForce;

import java.util.Scanner;

/**
 * 
 * <a href = "https://codeforces.com/problemset/problem/1644/A"> Link </a>.
 * @author Bris
 * @version 1.0
 * @since 8:32:51 PM -  Mar 31, 2022
 */
public class A1644 {
	/**
	 * The main method.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			String s = scanner.next();
			boolean hasR = false;
			boolean hasG = false;
			boolean hasB = false;
			String ans = "YES";
			for (int i = 0; i < 6; i++) {
				char ch = s.charAt(i);
				switch (ch) {
				case 'R':
					if (!hasR) {
						ans = "NO";
					}
					break;
				case 'G':
					if (!hasG) {
						ans = "NO";
					}
					break;
				case 'B':
					if (!hasB) {
						ans = "NO";
					}
					break;
				case 'r':
					hasR = true;
					break;
				case 'g':
					hasG = true;
					break;
				case 'b':
					hasB = true;
					break;
				}
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
