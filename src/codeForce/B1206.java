package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1206/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:20:53 AM -  Apr 19, 2022
 */
public class B1206 {
	/**
	 * The main method. 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		long ans = 0;
		long product = 1;
		long count0 = 0;
		for (long i = 0; i < n; i++) {
			long x = scanner.nextLong();
			if (x <= -1) {
				ans += (-1) - x;
				product *= -1;
			}else if (x >= 1) {
				ans += x - 1;
			}else {
				count0 += 1;
				product *= x;
			}
		}
		scanner.close();
		if (product == 0) {
			ans += count0;
		}else if (product == -1){
			ans += 2;
		}
		System.out.println(ans);
	}
}
