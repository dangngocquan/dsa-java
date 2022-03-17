package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A61 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/61/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 5:59:50 PM -  Mar 17, 2022
 */
public class A61 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.next();
		String s2 = scanner.next();
		scanner.close();
		//Solve
		//res - the corresponding answer
		String res = "";
		for (int i = 0; i <s1.length(); i++ ) {
			if (s1.charAt(i) == s2.charAt(i)) {
				res += "0";
			}else {
				res += "1";
			}
		}
		//Output
		System.out.println(res);
	}
}
