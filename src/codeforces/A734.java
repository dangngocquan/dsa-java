package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A734 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/734/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 4:59:04 PM -  Mar 17, 2022
 */
public class A734 {
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
		String s = scanner.next();
		scanner.close();
		//Solve
		//res- the answer
		String res = "Friendship";
		
		//countA - the number of 'A' character in string s
		int countA = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'A') countA++;
		}
		if (countA > n - countA) {
			res = "Anton";
		}else if (countA < n - countA) {
			res = "Danik";
		}
		//Output
		System.out.println(res);
	}
}
