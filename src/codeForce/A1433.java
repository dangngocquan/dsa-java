package codeForce;

import java.util.Scanner;

public class A1433 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		for (int i = 0; i < t; i++) {
			int x = scanner.nextInt();
			res[i] = 10*(x%10 - 1) + ((x+"").length())*((x+"").length()+1)/2;
		}
		scanner.close();
		//Output
		for (int i : res) {
			System.out.println(i);
		}
	}
}
