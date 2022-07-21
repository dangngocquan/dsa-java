package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1326/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 12:30:23 AM -  May 5, 2022
 */
public class B1326 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long tempMax = 0;
		StringBuilder ans = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			long bi = scanner.nextInt();
			if (bi <= 0) {
				ans.append((tempMax + bi) + " ");
			}else {
				tempMax += bi;
				ans.append(tempMax + " ");
			}
		}
		System.out.println(ans);
		scanner.close();
	}
}
