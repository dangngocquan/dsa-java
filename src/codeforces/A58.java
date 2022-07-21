package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A58 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/58/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 4:51:05 PM -  Mar 17, 2022
 */
public class A58 {
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
		//res - the answer
		String res = "YES";
		String hello = "hello";
		char[] arr = hello.toCharArray();
		
		//indexCheck - the index that we are checking
		int indexCheck = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == arr[indexCheck]) {
				indexCheck++;
				if (indexCheck == 5) break;
			}
		}
		if (indexCheck <5) {
			res = "NO";
		}
		//Output
		System.out.println(res);
	}
}
