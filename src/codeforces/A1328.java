package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A1328 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1328/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 6:39:56 PM -  Mar 17, 2022
 */
public class A1328 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Input + Solve
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		for (int i = 0; i < t; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if (a%b==0) {
				res[i] = 0;
			}else {
				res[i] = b*(a/b+1) - a;
			}
		}
		scanner.close();
		//Output
		for (int i: res) {
			System.out.println(i);
		}
	}
}
