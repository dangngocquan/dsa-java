package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A791 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/791/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 3:28:38 PM Mar 17, 2022
 */
public class A791 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */ 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		
		//res - the integer number of years after which Limak will become strictly larger than Bob.
		int res = 0;
		while (a <= b) {
			res++;
			a *= 3;
			b *= 2;
		}
		
		System.out.println(res);
	}
}
