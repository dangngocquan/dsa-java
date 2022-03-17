package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A281 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/281/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 3:16:14 PM Mar 17, 2022
 */
public class A281 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		String str = scanner.next();
		scanner.close();
		
		//res - the result string
		String res = str.substring(0,1).toUpperCase() + str.substring(1);
		
		System.out.println(res);
		
	}
}
