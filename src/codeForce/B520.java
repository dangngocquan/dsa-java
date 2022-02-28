package codeForce;

import java.util.Scanner;

public class B520 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.close();
		//Solve
		int res = 0;
		if (n> m) {
			res = n-m;
		}else if (n < m) {
			while (m> n) {
				if (m %2 == 1) {
					m += 1;
					res++;
				}else {
					m /= 2;
					res++;
				}
			}
			res += n-m;
		}
		//Output
		System.out.println(res);
	}
}
