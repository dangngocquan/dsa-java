package codeforces;

import java.util.Scanner;

public class A1326 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] n = new int[t];
		for (int i = 0; i < t; i++) n[i] = scanner.nextInt();
		scanner.close();
		//Output
		for (int i: n) {
			if (i == 1) {
				System.out.println(-1);
			}else {
				System.out.print(2);
				for (int j = 1; j < i; j++) System.out.print(3);
				System.out.println();
			}
		}
	}
}
