package CodeForce;

import java.util.Scanner;

public class A1529 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] ans = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int min = Integer.MAX_VALUE;
			for (int j = 0; j < n; j++) {
				int x = scanner.nextInt();
				if (x==min) {
					ans[i]++;
				}else if (x < min) {
					min = x;
					ans[i] = 1;
				}
			}
			ans[i] = n -ans[i];
		}
		scanner.close();
		//Output
		for (int i : ans) System.out.println(i);
	}
}
