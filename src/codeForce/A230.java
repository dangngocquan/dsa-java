package codeForce;

import java.util.Scanner;

public class A230 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt();
		int n = scanner.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = scanner.nextInt();
			y[i] = scanner.nextInt();
		}
		scanner.close();
		//Solve
		String res = "YES";
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-1; j++) {
				if (x[j] > x[j+1]) {
					x[j] += x[j+1];
					x[j+1] = x[j] - x[j+1];
					x[j] = x[j] - x[j+1];
					y[j] += y[j+1];
					y[j+1] = y[j] - y[j+1];
					y[j] = y[j] - y[j+1];
				}
			}
		}
		for (int i = 0; i < n; i++) {
			if (s <= x[i]) {
				res = "NO";
				break;
			}else {
				s += y[i];
			}
		}
		//Output
		System.out.println(res);
	}
}
