package codeforces;

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
	 * The main method
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			String s = scanner.next();
			s = "R" + s + "R";
			int ans = 0;
			int tempSize = 1;
			for (int i = 1; i < s.length(); i++) {
				if (s.charAt(i) == 'R') {
					ans = Math.max(ans, tempSize);
					tempSize = 1;
				}else {
					tempSize++;
				}
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
