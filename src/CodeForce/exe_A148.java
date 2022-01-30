package CodeForce;

import java.util.Scanner;

public class exe_A148 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int l = scanner.nextInt();
		int d = scanner.nextInt();
		scanner.close();
		//Solve
		int res = 0;
		for (int i = 1; i <= d; i++) {
			if (i%k==0 || i %n==0 || i %m == 0 || i % l == 0) res++;
		}
		//Output
		System.out.println(res);
	}
}
