package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1692/problem/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 10:11:59 AM -  Jun 25, 2022
 */
public class B1692 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int[] count = new int[10001];
			for (int i = 0; i < n; i++) {
				count[scanner.nextInt()]++;
			}
			
			int countRemove = 0;
			for (int i = 1; i < 10001; i++) {
				if (count[i] > 1) {
					countRemove += count[i] -1;
				}
			}
			int ans = n - ((countRemove % 2 == 0)? countRemove : countRemove+1);
			System.out.println(ans);
		}
		scanner.close();
	}
}
