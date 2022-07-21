package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve B1520 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1520/B"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 3:20:05 PM -  Mar 18, 2022
 */
public class B1520 {
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
			int size = (n+"").length();
			res[i] += 9*(size-1);
			int d = 0;
			for (int j = size-1; j>=0; j-- ) d += Math.pow(10, j);
			res[i] += n/d;
		}
		scanner.close();
		//Output
		for (int i: res) System.out.println(i);
	}
}
