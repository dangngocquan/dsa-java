package codeForce;

import java.util.Scanner;

public class A556 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String s = scanner.next();
		scanner.close();
		//Solve
		int res = 0;
		for (int i = 0; i <n; i++) {
			if (s.charAt(i) == '0') {
				res++;
			}else {
				res--;
			}
		}
		res = Math.abs(res);
		//Output
		System.out.println(res);
	}
}
