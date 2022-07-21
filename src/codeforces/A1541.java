package codeforces;

import java.util.Scanner;

public class A1541 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] n = new int[t];
		for (int i = 0; i < t; i++) n[i] = scanner.nextInt();
		scanner.close();
		//Solve + Output
		for (int x : n) {
			if (x %2== 0) {
				for (int j = 1; j <= x; j++) {
					if (j %2==1) {
						System.out.print((j+1) + " ");
					}else {
						System.out.print((j-1) + " ");
					}
				}
				System.out.println();
			}else {
				for (int j = 1; j <= x-3; j++) {
					if (j %2==1) {
						System.out.print((j+1) + " ");
					}else {
						System.out.print((j-1) + " ");
					}
				}
				System.out.println(x +" " + (x-2) + " " + (x-1));
			}
		}
	}
}
