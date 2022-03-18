package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A431 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/431/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 2:27:08 PM -  Mar 18, 2022
 */
public class A431 {
	/**
	 * 
	 * The main method - entry point of this app. 
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[5];
		for (int i = 1; i <=4; i++) a[i] = scanner.nextInt();
		String s = scanner.next();
		scanner.close();
		//Solve
		int res = 0;
		for (int i = 0; i < s.length(); i++) res += a[s.charAt(i)-'0'];
		//Output
		System.out.println(res);
	}
}
