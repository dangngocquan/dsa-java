package cses;

import java.util.Scanner;

/**
 * 
 * @author Bris
 * @since 11:40:40 PM - Jan 19, 2023
 *
 */
public class Task1094 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		long tempMax = scanner.nextLong();
		long minMoves = 0;
		while(n-- > 1) {
			long inputNum = scanner.nextLong();
			if (inputNum <= tempMax) {
				minMoves += tempMax - inputNum;
			}else {
				tempMax = inputNum;
			}
		}
		System.out.println(minMoves);
		scanner.close();
	}
}
