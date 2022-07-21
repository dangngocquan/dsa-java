package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve 71A problem in codeforce.
 * Link of this problem is <a href="https://codeforces.com/problemset/problem/71/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 9:28:00 AM Mar 17, 2022
 */
public class A71 {
	/**
	 * 
	 * This method is used to get the String after changed.
	 * 
	 * @param s The string which you want to get change.
	 * @return The string after changed.
	 */
	public static String getChange(String s) {
		String res = s;
		int n = s.length();
		if (n > 10) {
			res = "";
			res = s.substring(0,1) + (n-2) + s.substring(n-1,n);
		}
		return res;
	}
	
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//n - The number of String which you must to get change.
		int n = scanner.nextInt();
		
		//str - The String array, store the result.
		String[] str = new String[n];
		
		//Get results
		for (int i = 0; i < n; i++) {
			str[i] = scanner.next();
			str[i] = getChange(str[i]);
		}
		scanner.close();
		
		//Print out the result.
		for (String i: str) {
			System.out.println(i);
		}
	}
}
