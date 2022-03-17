package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A266 problem in codeforce. 
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/266/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 3:24:39 PM Mar 17, 2022
 */
public class A266 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String s = scanner.next();
		scanner.close();
		
		//res - the answer
		int res = 0;
		for (int i = 0; i < n-1; i++) {
			if (s.charAt(i) == s.charAt(i+1)) {
				res++;
			}
		}
		
		System.out.println(res);
	}
}
