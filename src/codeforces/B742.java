package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/742/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 1:24:06 PM -  Jun 8, 2022
 */
public class B742 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = scanner.nextInt();
		int[] count = new int[1000001];
		long ans = 0;
		for (int i = 0; i < n; i++) {
			int num = scanner.nextInt();
			int num2 = (int)(num ^ x);
			ans += count[num2];
			count[num]++;
		}
		System.out.println(ans);
		scanner.close();
	}
}
