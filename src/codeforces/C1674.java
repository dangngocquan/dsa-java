package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1674/problem/C"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:52:57 PM -  May 2, 2022
 */
public class C1674 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int q = scanner.nextInt();
		while (q-- > 0) {
			String s = scanner.next();
			String t = scanner.next();
			
			if (t.equals("a")) {
				System.out.println(1);
				continue;
			}
			
			boolean hasA = false;
			for (int i = 0; i < t.length(); i++) {
				if (t.charAt(i) == 'a') {
					hasA = true;
					break;
				}
			}
			if (hasA) {
				System.out.println(-1);
				continue;
			}
			
			System.out.println((long)Math.pow(2, s.length()));
		}
		scanner.close();
	}
}
