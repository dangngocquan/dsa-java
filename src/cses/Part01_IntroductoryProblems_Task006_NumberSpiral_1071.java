package cses;

import java.util.Scanner;

/**
 * 
 * @author Bris
 * @since 10:28:23 AM - Jan 20, 2023
 *
 */
public class Part01_IntroductoryProblems_Task006_NumberSpiral_1071 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		StringBuilder str = new StringBuilder();
		while (t-- > 0) {
			long y = scanner.nextLong();
			long x = scanner.nextLong();
			long maxVal = Math.max(y, x);
			long minVal = Math.min(y, x);
			long valBottomRight = maxVal * maxVal - (maxVal - 1);
			if (maxVal % 2 == 0) {
				if (y == minVal) {
					str.append(valBottomRight - (maxVal - minVal) + "\n");
				} else if (x == minVal) {
					str.append(valBottomRight + (maxVal - minVal) + "\n");
				}
			} else {
				if (y == minVal) {
					str.append(valBottomRight + (maxVal - minVal) + "\n");
				} else if (x == minVal) {
					str.append(valBottomRight - (maxVal - minVal) + "\n");
				}
			}
		}
		System.out.println(str);
		scanner.close();
	}
}
