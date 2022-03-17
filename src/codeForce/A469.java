package codeForce;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 * This class is used to solve A469 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/469/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 6:26:44 PM -  Mar 17, 2022
 */
public class A469 {
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
		Set<Integer> set = new LinkedHashSet<Integer>();
		int n1 = scanner.nextInt();
		for (int i = 1; i <= n1; i++) {
			set.add(scanner.nextInt());
		}
		int n2 = scanner.nextInt();
		for (int i = 1; i <= n2; i++) {
			set.add(scanner.nextInt());
		}
		scanner.close();
		//Solve
		String res = "Oh, my keyboard!";
		if (n == set.size()) res = "I become the guy.";
		//Output
		System.out.println(res);
		
	}
}
