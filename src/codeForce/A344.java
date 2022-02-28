package codeForce;

import java.util.Scanner;

public class A344 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] a = new String[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.next();
		}
		scanner.close();
		//Solve
		int res = 1;
		String temp = a[0];
		for (int i = 1; i <n ; i++) {
			if (!a[i].equals(temp)) {
				res++;
				temp = a[i];
			}
		}
		//Output
		System.out.println(res);
	}
}
