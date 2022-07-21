package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A131 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/131/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 6:28:51 PM -  Mar 17, 2022
 */
public class A131 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		scanner.close();
		//Solve
		String res = "";
		if(str.equals(str.toUpperCase())) {
			res = str.toLowerCase();
		}else if (str.substring(1).equals(str.substring(1).toUpperCase())) {
			res = str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
		}else {
			res = str;
		}
		//Output
		System.out.println(res);
	}
}
