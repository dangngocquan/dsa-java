package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve B32 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/32/B"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 2:43:17 PM -  Mar 18, 2022
 */
public class B32 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next() + "+";
		scanner.close();
		//Solve
		String res = "";
		for (int i = 0; i < s.length()-1; i++) {
			if (s.charAt(i) == '.') {
				res += "0";
			}else {
				if (s.charAt(i+1) == '.') {
					res += "1";
				}else {
					res += "2";
				}
				i++;
			}
		}
		//Output
		System.out.println(res);
	}
}
