package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1395/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 11:16:29 AM -  May 31, 2022
 */
public class A1395 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int[] color = new int[4];
			for (int i = 0; i < 4; i++) {
				color[i] = scanner.nextInt();
			}
			if ((color[0] - color[1]) % 2 == 0 && (color[1] - color[2]) % 2 == 0) {
				System.out.println("Yes");
			}else {
				int oddCount = 0;
				for (int i = 0; i < 4; i++) {
					if (color[i] % 2 == 1) {
						oddCount++;
					}
				}
				if (oddCount <= 1) {
					System.out.println("Yes");
				}else {
					oddCount = 0;
					if (color[0] > 0 && color[1] > 0 && color[2] > 0) {
						color[0]--;
						color[1]--;
						color[2]--;
						color[3] += 3;
						for (int i = 0; i < 4; i++) {
							if (color[i] % 2 == 1) {
								oddCount++;
							}
							
						}
						if (oddCount <= 1) {
							System.out.println("Yes");
						}else {
							System.out.println("No");
						}
					}else {
						System.out.println("No");
					}
				}
			}
		}
		scanner.close();
	}
}
