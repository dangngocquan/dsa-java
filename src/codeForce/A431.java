package codeForce;

import java.util.Scanner;

public class A431 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[5];
		for (int i = 1; i <=4; i++) a[i] = scanner.nextInt();
		String s = scanner.next();
		scanner.close();
		//Solve
		int res = 0;
		for (int i = 0; i < s.length(); i++) res += a[s.charAt(i)-'0'];
		//Output
		System.out.println(res);
	}
}
