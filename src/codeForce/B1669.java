package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1669/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 12:05:20 PM -  May 1, 2022
 */
public class B1669 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			int[] count = new int[n+1];
			for (int i = 0; i < n; i++) {
				count[scanner.nextInt()]++;
			}
			boolean isFound = false;
			for (int i = 0; i <=n; i++) {
				if (count[i] >= 3) {
					System.out.println(i);
					isFound = true;
					break;
				}
			}
			if (!isFound) {
				System.out.println(-1);
			}
		}
		scanner.close();
	}
}
