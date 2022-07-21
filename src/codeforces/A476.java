package codeforces;

import java.util.Scanner;

public class A476 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.close();
		//Solve
		int res = -1;
		for (int i = (n+1)/2; i <= n; i++) {
			if (i%m==0) {
				res = i;
				break;
			}
		}
		//Output
		System.out.println(res);
	}
}
