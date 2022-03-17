package codeForce;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 * This class is used to solve A443 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/443/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 6:44:21 PM -  Mar 17, 2022
 */
public class A443 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		scanner.close();
		//Solve
		Set<Character> set = new LinkedHashSet<Character>();
		if (s.length()>2) {
			for (int i = 1; i < s.length(); i+=3) {
				set.add(s.charAt(i));
			}
		}
		//Output
		System.out.println(set.size());
	}
}
