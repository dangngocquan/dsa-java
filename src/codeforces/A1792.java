package codeforces;

import java.util.Scanner;

/**
 * 
 * @author Bris
 * @since 9:35:56 PM - Jan 24, 2023
 *
 */
public class A1792 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int count1 = 0;
			int ans = 0;
			while (n-- > 0) {
				int num = scanner.nextInt();
				if (num == 1) {
					count1++;
				}else {
					ans++;
				}
			}
			ans += count1/2 + count1%2;
			System.out.println(ans);
		}
		scanner.close();
	}
}
