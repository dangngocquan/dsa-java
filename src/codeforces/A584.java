package codeforces;

import java.util.Scanner;

public class A584 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int t = scanner.nextInt();
		scanner.close();
		//Output
		if (n==1 && t==10) {
				System.out.println(-1);
		}else {
			if (t<10) {
				for (int i = 1; i <= n; i++) System.out.print(t);
			}else {
				System.out.print(1);
				for (int i = 1; i <= n -1; i++) System.out.print(0);
			}
		}
	}
}
