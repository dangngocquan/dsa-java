package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A59 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/59/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 3:47:43 PM -  Mar 17, 2022
 */
public class A59 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		scanner.close();
		
		//res - the corrected word s
		String res = "";
		
		//count - the number of the Uppercase character in s
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			int x = (int)(s.charAt(i));
			if (65<= x && x <= 90) {
				count++;
			}
		}
		if (count > s.length()-count) {
			res = s.toUpperCase();
		}else {
			res = s.toLowerCase();
		}
		
		System.out.println(res);
	}
}
