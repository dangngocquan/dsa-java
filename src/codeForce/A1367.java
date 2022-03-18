package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A1367 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1367/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 12:56:39 PM -  Mar 18, 2022
 */
public class A1367 {
	/**
	 * 
	 * This method is used to get the result of each test case.
	 * 
	 * @param s is the string which you need to solve.
	 * @return Return the answer.
	 */
	public static String getResult(String s) {
		String res = "";
		res += s.charAt(0);
		if (s.length()>2) {
			for (int i = 1; i < s.length()-1; i+=2) {
				res += s.charAt(i);
			}
		}
		res += s.charAt(s.length()-1);
		return res;
	}
	
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] res = new String[t];
		for (int i = 0; i < t; i++) {
			String s = scanner.next();
			res[i] = getResult(s);
		}
		scanner.close();
		//Output
		for (String i: res) {
			System.out.println(i);
		}
	}
}
