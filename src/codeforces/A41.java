package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A41 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/41/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 4:56:01 PM -  Mar 17, 2022
 */
public class A41 {
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
		String t = scanner.next();
		scanner.close();
		//Solve
		//res - the answer
		String res = "NO";
		char[] arr = s.toCharArray();
		
		//a - the reverse string of s
		String a = "";
		for (char i: arr) {
			a = i+ a;
		}
		if (a.equals(t)) res = "YES";
		//Output
		System.out.println(res);
	}
	
}
