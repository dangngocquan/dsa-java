package codeforces;

import java.util.Arrays;
import java.util.Scanner;
 
/**
 * <a href = "https://codeforces.com/problemset/problem/1512/D"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 6:58:21 PM -  Aug 28, 2022
 */
public class D1512 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			long sum = 0;
			int[] b = new int[n+2];
			for (int i = 0; i < n+2; i++) {
				b[i] = scanner.nextInt();
				sum += (long)(b[i]);
			}
			Arrays.sort(b);
			
			int index = -1;
			for (int i = 0; i < n+1; i++) {
				if (sum - b[i] == 2*b[n+1]) {
					index = i;
					break;
				}
			}
			if (index == -1) {
				if (sum - b[n+1] == 2*b[n]) {
					index = n;
				}
			}
			
			if (index == -1) {
				System.out.println(-1);
			}else {
				for (int i = 0; i < n+1; i++) {
					if (i == index) {
						continue;
					}
					System.out.print(b[i] + " ");
				}
				System.out.println();
			}
		}
		scanner.close();
	}
}
