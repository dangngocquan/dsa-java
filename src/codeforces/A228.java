package codeforces;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 * This class is used to solve A228 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/228/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 6:10:46 PM -  Mar 17, 2022
 */
public class A228 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		Set<Integer> set = new LinkedHashSet<>();
		for (int i = 1; i <= 4; i++) {
			set.add(scanner.nextInt());
		}
		scanner.close();
		//Output
		System.out.println(4-set.size());
	}
}
