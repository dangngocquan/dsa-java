package codeForce;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 * This class is  used to solve A520 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/520/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 6:51:30 PM -  Mar 17, 2022
 */
public class A520 {
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
		s = s.toLowerCase();
		Set<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < n; i++) {
			set.add(s.charAt(i));
		}
		String res = "NO";
		if (set.size() == 26) res = "YES";
		//Output
		System.out.println(res);
	}
}
