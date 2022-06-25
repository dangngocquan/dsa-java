package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1213/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:38:13 AM -  Jun 25, 2022
 */
public class A1213 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int oddCount = 0;
		int evenCount = 0;
		for (int i = 0; i < n; i++) {
			if (scanner.nextInt() % 2 == 0) {
				evenCount++;
			}else {
				oddCount++;
			}
		}
		scanner.close();
		System.out.println(Math.min(oddCount, evenCount));
	}
}
