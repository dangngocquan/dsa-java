package cses;

import java.util.Scanner;

/**
 * 
 * @author Bris
 * @since 11:25:25 PM - Jan 19, 2023
 *
 */
public class Part01_IntroductoryProblems_Task002_MissingNumber_1083 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		long counter = n - 1;
		long sum = 0;
		while (counter-- > 0) {
			sum += scanner.nextLong();
		}
		System.out.println(n * (n + 1) / 2 - sum);
		scanner.close();
	}
}
