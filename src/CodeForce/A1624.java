package CodeForce;

import java.util.Scanner;

public class A1624 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int max = 0;
			int min = Integer.MAX_VALUE;
			for (int j = 1; j <= n; j++) {
				int x = scanner.nextInt();
				max = Math.max(max, x);
				min = Math.min(min, x);
			}
			res[i] = max - min;
		}
		scanner.close();
		//Output
		for (int i : res) System.out.println(i);
	}
}
