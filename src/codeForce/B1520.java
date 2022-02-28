package codeForce;

import java.util.Scanner;

public class B1520 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int size = (n+"").length();
			res[i] += 9*(size-1);
			int d = 0;
			for (int j = size-1; j>=0; j-- ) d += Math.pow(10, j);
			res[i] += n/d;
		}
		scanner.close();
		//Output
		for (int i: res) System.out.println(i);
	}
}
