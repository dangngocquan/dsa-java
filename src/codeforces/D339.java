package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/339/D"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:18:27 AM -  Aug 25, 2022
 */
public class D339 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] array = new int[(1<<(n+1)) - 1];
		for (int index = (1<<n) - 1; index <=  (1<<(n+1)) - 2; index++) {
			array[index] = scanner.nextInt();
		}
		
		for (int d = n-1; d >= 0; d--) {
			for (int index = (1<<d) - 1, i = 0; index <=  (1<<(d+1)) - 2; index++, i++) {
				int index1 = (1<<(d+1)) - 1 + 2*i;
				array[index] = ((n-d) % 2 == 0)? array[index1] ^ array[index1+1] : array[index1] | array[index1+1];
			}
		}
		StringBuilder s = new StringBuilder();
		while (m-- > 0) {
			int p = scanner.nextInt();
			int b = scanner.nextInt();
			int tempIndex = p-1;
			array[(1<<n) - 1 + tempIndex] = b;
			for (int d = n-1; d >= 0; d--) {
				tempIndex /= 2;
				int index1 = (1<<(d+1)) - 1 + tempIndex*2;
				array[(1<<d) - 1 + tempIndex] = ((n-d) % 2 == 0)? array[index1] ^ array[index1+1] : array[index1] | array[index1+1];
			}
			s.append(array[0]);
			s.append(' ');
		}
		System.out.println(s);
		scanner.close();
	}
}