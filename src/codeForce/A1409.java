package codeForce;

import java.util.Scanner;

public class A1409 {
	static int getResult(int a, int b) {
		int res = (int)(Math.ceil((Math.abs(a-b))*1.0/10));
		return res;
	}
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		for (int i =0; i < t; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			res[i] = getResult(a, b);
		}
		scanner.close();
		//Output
		for (int i : res) {
			System.out.println(i);
		}
	}
}
