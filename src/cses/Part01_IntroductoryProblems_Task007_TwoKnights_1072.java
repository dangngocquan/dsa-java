package cses;

import java.util.Scanner;

/**
 * 
 * @author Bris
 * @since 10:52:49 AM - Jan 20, 2023
 *
 */
public class Part01_IntroductoryProblems_Task007_TwoKnights_1072 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		long k = 0;
		StringBuilder s = new StringBuilder();
		while (k++ < n) {
			if (k == 1) {
				s.append(0 + "\n");
			} else if (k == 2) {
				s.append(6 + "\n");
			} else if (k == 3) {
				s.append(28 + "\n");
			} else if (k == 4) {
				s.append(96 + "\n");
			} else if (k == 5) {
				s.append(252 + "\n");
			} else if (k == 6) {
				s.append(550 + "\n");
			} else {
				long counter = 0;
				// 4 corners of k * k
				counter += 4 * (k * k - 2 - 1);
				// 4 sides except 4 corner of k * k
				counter += 4 * (2 * (k * k - 3 - 1) + (k - 4) * (k * k - 4 - 1));
				// 4 corners of (k-2) * (k-2)
				counter += 4 * (k * k - 4 - 1);
				// 4 sides except 4 corner of (k-2) * (k-2)
				counter += 4 * (k - 4) * (k * k - 6 - 1);
				// Other
				counter += (k - 4) * (k - 4) * (k * k - 8 - 1);
				s.append(counter / 2 + "\n");
			}
		}
		System.out.println(s);
		scanner.close();
	}
}
