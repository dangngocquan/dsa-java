package cses;

import java.util.Scanner;

/**
 * 
 * @author Bris
 * @since 11:34:59 PM - Jan 19, 2023
 *
 */
public class Part01_IntroductoryProblems_Task003_Repetitions_1069 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		long maxLength = 1;
		char tempChar = str.charAt(0);
		long tempLength = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == tempChar) {
				tempLength++;
			} else {
				maxLength = Math.max(maxLength, tempLength);
				tempLength = 1;
				tempChar = str.charAt(index);
			}
		}
		maxLength = Math.max(maxLength, tempLength);
		System.out.println(maxLength);
		scanner.close();
	}
}
