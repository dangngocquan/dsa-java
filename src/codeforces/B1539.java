package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1539/problem/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 12:59:41 PM -  Jul 16, 2022
 */
public class B1539 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int q = scanner.nextInt();
		String s = scanner.next();
		int[] newLength = new int[n+1];
		newLength[0] = 0;
		for (int i = 1; i <= n; i++) {
			newLength[i] = newLength[i-1] + s.charAt(i-1) - 'a' + 1;
		}
		
		while (q-- > 0) {
			int l = scanner.nextInt();
			int r = scanner.nextInt();
			System.out.println(newLength[r] - newLength[l-1]);
		}
		scanner.close();
	}
}
