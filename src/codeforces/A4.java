package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve 4A problem in codeforce.
 * Link this 4A problem is <a href="https://codeforces.com/problemset/problem/4/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 9:22:03 AM Mar 17, 2022
 */
public class A4 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//w - The weight of the watermelon bought by the boys.
		int w = scanner.nextInt();
		scanner.close();
		
		//res - The result
		String res = "NO";
		if (w %2==0 && w/2 >=2) res = "YES";
		//Output
		System.out.println(res);
	}
}
