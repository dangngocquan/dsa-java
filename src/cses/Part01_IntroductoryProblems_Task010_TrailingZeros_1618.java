package cses;

import java.util.Scanner;

/**
 * 
 * @author Bris
 * @since 1:30:25 PM - Jan 20, 2023
 *
 */
public class Part01_IntroductoryProblems_Task010_TrailingZeros_1618 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int counter = 0;
		while ((n /= 5) > 0) {
			counter += n;
		}
		System.out.println(counter);
		scanner.close();
	}
}
