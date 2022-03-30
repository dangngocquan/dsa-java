package codeForce;

import java.util.Scanner;

/**
 * 
 * <a href = "https://codeforces.com/problemset/problem/688/B"> Link </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 1:47:14 PM -  Mar 27, 2022
 */
public class B688 {
	/**
	 * The main method
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		scanner.close();
		
		System.out.print(s);
		for (int i = s.length() -1; i >= 0; i-- ) {
			System.out.print(s.charAt(i));
		}
	}
}
