package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A208 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/208/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 6:32:53 PM -  Mar 17, 2022
 */
public class A208 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		scanner.close();
		//Solve
		String res = s.replaceAll("WUB", " ");
		res = res.replaceAll("\\s{2,}", " ").trim();
		//Output
		System.out.println(res);
	}
}
