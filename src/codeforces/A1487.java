package codeforces;

import java.util.Scanner;

public class A1487 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] ans = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int min = Integer.MAX_VALUE;
			int countMin = 1;
			for (int j = 0; j < n; j++) {
				int x = scanner.nextInt();
				if (x < min) {
					min = x;
					countMin = 1;
				}else if (x == min){
					countMin++;
				}
			}
			ans[i] = n - countMin;
		}
		scanner.close();
		//Output
		for (int i : ans) System.out.println(i);
	}
}
