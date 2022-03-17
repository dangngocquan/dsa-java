package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A282 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/282/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 2:55:27 PM Mar 17, 2022
 */
public class A282 {
	/**
	 * 
	 * The main mehtod - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		//res - the final value of x.
		int res = 0;
		for (int i = 1; i <=n; i++) {
			String str = scanner.next();
			if (str.charAt(1) == '+') {
				res +=1;
			}else {
				res -=1;
			}
		}
		scanner.close();
		
		System.out.println(res);
	}
}
