package CodeForce;

import java.util.Arrays;
import java.util.Scanner;

public class exe_B1360 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int[] s = new int[n];
			for (int j = 0; j < n ; j++) {
				s[j] = scanner.nextInt();
			}
			Arrays.sort(s);
			res[i] = s[n-1] - s[0];
			for (int j = 1; j < n; j++) {
				res[i] = Math.min(res[i], s[j] - s[j-1]);
			}
		}
		scanner.close();
		//Output
		for (int i : res) {
			System.out.println(i);
		}
	}
}
