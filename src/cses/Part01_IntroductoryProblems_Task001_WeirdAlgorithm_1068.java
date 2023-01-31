package cses;

import java.util.Scanner;

/**
 * 
 * @author Bris
 * @since 11:08:30 PM - Jan 19, 2023
 *
 */
public class Part01_IntroductoryProblems_Task001_WeirdAlgorithm_1068 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextInt();
		scanner.close();
		StringBuilder str = new StringBuilder();
		str.append(n + " ");
		while (n > 1) {
			n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
			str.append(n + " ");
		}
		System.out.println(str);
	}
}
