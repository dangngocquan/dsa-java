package codeForce;

import java.util.Scanner;

public class A1553 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] ans = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			ans[i] = (n+1)/10;
		}
		scanner.close();
		//Output
		for (int i : ans) System.out.println(i);
	}
}
