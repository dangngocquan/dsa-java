package codeforces;

import java.util.Scanner;

public class A577 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = scanner.nextInt();
		scanner.close();
		//Solve
		int res = 0;
		//x/i <= n .... x <= n*i .... i >= x/n
		for (int i = (int) Math.ceil(x*1.0/n) ; i <= n; i++) {
			if (x%i==0) res++;
		}
		//Output
		System.out.println(res);
	}
}
