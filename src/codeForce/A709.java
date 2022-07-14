package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/709/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 11:58:21 PM -  Jul 14, 2022
 */
public class A709 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int b = scanner.nextInt();
		int d = scanner.nextInt();
		
		int temp = 0;
		int ans = 0;
		for (int i = 1; i <= n; i++) {
			int x = scanner.nextInt();
			if (x > b) {
				continue;
			}
			temp += x;
			if (temp > d) {
				ans++;
				temp = 0;
			}
		}
		System.out.println(ans);
		scanner.close();
	}
}
