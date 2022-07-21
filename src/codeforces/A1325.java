package codeforces;

import java.util.Scanner;

public class A1325 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] b = new int[t];
		for (int i = 0; i < t; i++) {
			b[i] = scanner.nextInt()-1;
		}
		scanner.close();
		//Output
		for (int i : b) System.out.println(1+ " " + i);
	}
}
