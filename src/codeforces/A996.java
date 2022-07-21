package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A996 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/996/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 10:26:29 PM -  Mar 17, 2022
 */
public class A996 {
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
		scanner.close();
		//Solve
		int res = n/100;
		n %=100;
		res += n/20;
		n %= 20;
		res += n/10;
		n %= 10;
		res += n /5;
		n %= 5;
		res += n;
		//Output
		System.out.println(res);
	}
}
