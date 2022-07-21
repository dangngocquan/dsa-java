package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1382/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 12:51:36 AM -  Apr 30, 2022
 */
public class B1382 {
	/**
	 * .
	 * @param args .
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			int firstIndexNon1 = n+1;
			for (int i = 0; i < n; i++) {
				if (scanner.nextInt() != 1) {
					firstIndexNon1 = Math.min(firstIndexNon1, i);
				}
			}
			System.out.println((firstIndexNon1 % 2 == 0)? "First" : "Second");
		}
		scanner.close();
	}
}
