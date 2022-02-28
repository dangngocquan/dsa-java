package codeForce;

import java.util.Scanner;

public class A732 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int r = scanner.nextInt();
		scanner.close();
		//Solve
		int res = 10;
		for (int i = 1; i < 10; i++) {
			if ((k*i) %10 == r || (k*i) %10 == 0) {
				res = i;
				break;
			}
		}
		//Output
		System.out.println(res);
	}
}
