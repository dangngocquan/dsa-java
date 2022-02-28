package codeForce;

import java.util.Scanner;

public class B1385 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] res = new String[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			res[i] = "";
			int[] arr = new int[n+1];
			for (int j = 1; j <= 2*n; j++) {
				int x = scanner.nextInt();
				arr[x] += 1;
				if (arr[x] == 1) res[i] += x+" ";
			}
		}
		scanner.close();
		//Output
		for (String i : res) {
			System.out.println(i);
		}
	}
}
