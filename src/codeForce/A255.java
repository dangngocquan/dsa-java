package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/255/A"> Link </a>.
 * @author Bris
 * @version 1.0
 * @since 7:49:02 PM -  Apr 18, 2022
 */
public class A255 {
	/**
	 * The main method.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] count = new int[3];
		for (int i = 0; i < n; i++) {
			count[i%3] += scanner.nextInt();
		}
		scanner.close();
		String[] ans = {"chest", "biceps", "back"};
		
		int max = count[0];
		int indexOfMax = 0;
		for (int i = 1; i <= 2; i++) {
			if (count[i] > max) {
				max = count[i];
				indexOfMax = i;
			}
		}
		System.out.println(ans[indexOfMax]);
	}
}
