package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/478/A"> Link </a>.
 * @author Bris
 * @version 1.0
 * @since 10:30:20 PM -  Apr 8, 2022
 */
public class A478 {
	/**
	 * The main method.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += scanner.nextInt();
		}
		if (sum % 5 == 0 && sum > 0) {
			System.out.println(sum / 5);
		}else {
			System.out.println(-1);
		}
		scanner.close();
	}
}
