package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve 231A problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/231/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 9:34:57 AM Mar 17, 2022
 */
public class A231 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//n - the number of problems in the contest
		int n = scanner.nextInt();
		
		//res - the number of problems the friends will implement on the contest.
		int res = 0;
		
		//Get res
		for (int i= 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < 3; j++) {
				if (scanner.nextInt()==1) count++;
			}
			if (count >= 2) res++;
		}
		scanner.close();
		
		//Print out the result.
		System.out.println(res);
	}
}
