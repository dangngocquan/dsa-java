package cses.IntroductoryProblems;

import java.util.Scanner;

/**
 * 
 * @author Bris
 * @since 11:49:02 PM - Jan 19, 2023
 *
 */
public class Task1070 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if (n == 1) {
			System.out.println(1);
		}else if (n < 4) {
			System.out.println("NO SOLUTION");
		}else {
			StringBuilder str = new StringBuilder();
			for (int index = 0; index < n; index++) {
				str.append((index % 2 == 0)? (n/2 + index/2 + 1 + " ") : (index/2+1 + " "));
				
			}
			System.out.print(str);
		}
		scanner.close();
	}
}
