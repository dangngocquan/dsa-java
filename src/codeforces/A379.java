package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A379 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/379/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 2:12:18 PM -  Mar 18, 2022
 */
public class A379 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		//Solve
		int res = 0;
		int count = 0;
		while (a>0) {
			res++;
			a--;
			count++;
			if (count == b) {
				count = 0;
				a++;
			}
		}
		//Output
		System.out.println(res);
	}
}
