package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A705 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/705/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 6:07:32 PM -  Mar 17, 2022
 */
public class A705 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		//Solve
		//res - the answer
		String res = "";
		for (int i = 1; i <=n; i++) {
			if (i==1) {
				res += "I hate";
			}else {
				if (i%2==1) {
					res += " that I hate";
				}else {
					res += " that I love";
				}
			}
		}
		res += " it";
		//Output
		System.out.println(res);
	}
}
