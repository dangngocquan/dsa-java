package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A118 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/118/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 3:05:47 PM Mar 17, 2022
 */
public class A118 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next().toLowerCase();
		scanner.close();
		
		//res - the result String
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			char x = str.charAt(i);
			if (x != 'u'&&x != 'e'&&x != 'o'&&x != 'a'&&x != 'i'&&x != 'y') {
				res += "." + x;
			}
		}
		
		System.out.println(res);
	}
}
