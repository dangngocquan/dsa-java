package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1490/B"> Link </a>.
 * @author Bris
 * @version 1.0
 * @since 9:46:05 PM -  Apr 9, 2022
 */
public class B1490 {
	/**
	 * The main method.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			int[] count = new int[3];
			for (int i = 1; i <= n; i++) {
				count[scanner.nextInt() % 3]++;
			}
			int ans = 0;
			for (int i = 0; i < 3; i++) {
				if (count[i] > n / 3) {
					ans += count[i] - n / 3;
					count[(i+1)%3] += count[i] - n/3;
					count[i] = n / 3;
				}
			}
			for (int i = 0; i < 3; i++) {
				if (count[i] > n / 3) {
					ans += count[i] - n / 3;
					count[(i+1)%3] += count[i] - n/3;
					count[i] = n / 3;
				}
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
