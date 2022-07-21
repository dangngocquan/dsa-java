package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A155 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/155/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 11:06:43 PM -  Mar 17, 2022
 */
public class A155 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Input + solve
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int res = 0;
		int max = 0;
		int min = 0;
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			if (i == 0) {
				max = x;
				min = x;
			}else {
				if (x > max) {
					res++;
					max = x;
				}else if (x < min) {
					min = x;
					res++;
				}
			}
		}
		scanner.close();
		//Output
		System.out.println(res);
	}
}
