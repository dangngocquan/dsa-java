package codeforces;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * This class is use to solve B1360 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1360/B"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 1:49:37 PM -  Mar 18, 2022
 */
public class B1360 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int[] s = new int[n];
			for (int j = 0; j < n ; j++) {
				s[j] = scanner.nextInt();
			}
			Arrays.sort(s);
			res[i] = s[n-1] - s[0];
			for (int j = 1; j < n; j++) {
				res[i] = Math.min(res[i], s[j] - s[j-1]);
			}
		}
		scanner.close();
		//Output
		for (int i : res) {
			System.out.println(i);
		}
	}
}
