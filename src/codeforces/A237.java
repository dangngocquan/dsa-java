package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/237/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 11:52:44 AM -  Jun 25, 2022
 */
public class A237 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] timeCount = new int[1440];
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt() * 60 + scanner.nextInt();
			timeCount[x]++;
			ans = Math.max(ans, timeCount[x]);
		}
		System.out.println(ans);
		scanner.close();
	}
}
