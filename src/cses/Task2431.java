package cses;

import java.util.Scanner;

/**
 * 
 * @author Bris
 * @since 10:41:05 PM - Jan 20, 2023
 *
 */
public class Task2431 {
	// 9*1 + 90*2 + 900 * 3 = 999 + 990 + 900 = 1000 - 1 + 1000 - 10 + 1000 - 100 = 3 * 1000 - (10^3-1) / 9
	public static char solve(long k) {
		long numDigits = 1;
		long numChars = numDigits * (long)Math.pow(10, numDigits) - ((long)Math.pow(10, numDigits)-1)/9;
		while (k > numChars) {
			numDigits++;
			numChars = numDigits * (long)Math.pow(10, numDigits) - ((long)Math.pow(10, numDigits)-1)/9;
		}
		numChars = (numDigits-1) * (long)Math.pow(10, numDigits-1) - ((long)Math.pow(10, numDigits-1)-1)/9;
		k -= numChars;
		long number = (long)Math.pow(10, numDigits-1) + k / numDigits;
		k -= k / numDigits * numDigits;
		if (k == 0) {
			number--;
			return (number+"").charAt((int)numDigits-1);
		}else {
			return (number + "").charAt((int)k-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int q = scanner.nextInt();
		StringBuilder str = new StringBuilder();
		while (q-- > 0) {
			long k = scanner.nextLong();
			char ans = solve(k);
			str.append(ans);
			str.append("\n");
		}
		System.out.println(str);
		scanner.close();
	}
}
