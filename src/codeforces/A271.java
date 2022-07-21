package codeforces;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 * This class is used to solve A271 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/271/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 5:04:59 PM -  Mar 17, 2022
 */
public class A271 {
	/**
	 * 
	 * This method is used to check the number n if it is a distinct digits number or not.
	 * 
	 * @param n is the number which you want to check.
	 * @return Return true if n is a distinct digits number. Otherwise, return false if n isn't a distinct digits number.
	 */
	public static boolean isDistinctDigitsNumber(int n) {
		Set<Integer> set = new LinkedHashSet<Integer>();
		while (n > 0) {
			set.add(n%10);
			n /= 10;
		}
		boolean res = true;
		if (set.size() < 4) res = false;
		return res;
	}
	
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int y = scanner.nextInt();
		scanner.close();
		//Solve
		//res - the minimum year number that is strictly larger than y and all it's digits are distinct.
		int res = y+1;
		while (!isDistinctDigitsNumber(res)) {
			res++;
		}
		//Output
		System.out.println(res);
		
	}
}
