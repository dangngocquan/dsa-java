package cses.IntroductoryProblems;

import java.util.Scanner;

/**
 * 
 * @author Bris
 * @since 1:22:55 PM - Jan 20, 2023
 *
 */
public class Task1617 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long val = 1;
		long modd = 1000000007;
		while(n-- > 0) {
			val = val << 1;
			val %= modd;
		}
		System.out.println(val);
		scanner.close();
	}
}
