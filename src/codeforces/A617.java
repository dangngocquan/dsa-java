package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A617 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/617/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 3:44:56 PM -  Mar 17, 2022
 */
public class A617 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		
		//res - the minimum number of steps that elephant needs to make to get from point 0 to point x.
		int res = 0;
		if (n % 5 ==0) {
			res = n/5;
		}else {
			res = n/5 +1;
		}
		
		System.out.println(res);
	}
}
