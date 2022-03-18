package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A460 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/460/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 1:57:51 PM -  Mar 18, 2022
 */
public class A460 {
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
		int count = 0;
		while (n>0) {
			n -=1;
			count++;
			if (count%m==0) n++;
		}
		//Output
		System.out.println(count);
	}
}
