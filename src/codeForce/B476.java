package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/476/B"> Link </a>.
 * @author Bris
 * @version 1.0
 * @since 10:12:05 PM -  Mar 30, 2022
 */
public class B476 {
	/**
	 * Calculate factorial
	 * @param n
	 * @return
	 */
	public static int factorial(int n) {
		if (n==0) {
			return 1;
		}
		return n * factorial(n-1);
	}
	
	/**
	 * 
	 * The main method.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.next();
		int positiveCount = 0;
		int negativeCount = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == '+' ) {
				positiveCount++;
			}else {
				negativeCount++;
			}
		}
		String s2 = scanner.next();
		for (int i = 0; i < s2.length(); i++) {
			if (s2.charAt(i) == '+' ) {
				positiveCount--;
			}else if (s2.charAt(i) == '-') {
				negativeCount--;
			}
		}
		double ans = 0.0;
		if (positiveCount >= 0 && negativeCount >= 0) {
			ans = factorial(positiveCount + negativeCount) * 1.0 / 
					(factorial(negativeCount) * factorial(positiveCount) * Math.pow(2, positiveCount+ negativeCount));
		}
		System.out.println(ans);
		scanner.close();
	}
}
