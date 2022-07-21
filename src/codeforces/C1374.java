package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve C1374 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1374/C" > here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 3:24:06 PM -  Mar 18, 2022
 */
public class C1374 {
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
			String s = scanner.next();
			int temp = 0;
			for (int j = 0; j < n; j++) {
				if (s.charAt(j) == ')') {
					temp--;
				}else {
					temp++;
				}
				if (temp < 0) {
					res[i]++;
					temp = 0;
				}
			}
		}
		scanner.close();
		//Output
		for (int i : res) System.out.println(i);
	}
}
