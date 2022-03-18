package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A9 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/9/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 3:09:11 PM -  Mar 18, 2022
 */
public class A9 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int max = Math.max(scanner.nextInt(), scanner.nextInt());
		scanner.close();
		//Solve
		int k = 6+1-max;
		//Output
		if (6%k==0) {
			System.out.println(1+"/"+(6/k));
		}else if (k%2==0) {
			System.out.println((k/2) + "/" + 3);
		}else {
			System.out.println(k+"/" + 6);
		}
	}
}
