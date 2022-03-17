package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A479 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/479/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 6:21:38 PM -  Mar 17, 2022
 */
public class A479 {
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
		int c = scanner.nextInt();
		scanner.close();
		//Solve
		//res - the maximum value of the expression that you can obtain.
		int res = 0;
		int x = a*b*c;
		if (x >res) res = x;
		x = (a+b)*c;
		if (x >res) res = x;
		x = a+b*c;
		if (x >res) res = x;
		x = a*(b+c);
		if (x >res) res = x;
		x = a*b+c;
		if (x >res) res = x;
		x = a+b+c;
		if (x >res) res = x;
		//Output 
		System.out.println(res);
	}
}
