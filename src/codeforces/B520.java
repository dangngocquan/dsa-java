package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve B520 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/520/B" > here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 2:24:56 PM -  Mar 18, 2022
 */
public class B520 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.close();
		//Solve
		int res = 0;
		if (n> m) {
			res = n-m;
		}else if (n < m) {
			while (m> n) {
				if (m %2 == 1) {
					m += 1;
					res++;
				}else {
					m /= 2;
					res++;
				}
			}
			res += n-m;
		}
		//Output
		System.out.println(res);
	}
}
