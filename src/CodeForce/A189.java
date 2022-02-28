package CodeForce;

import java.util.Scanner;

public class A189 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		//Solve
		int res = 1;
		for (int i = 0; i <= n/a; i++) {
			for (int j = 0; j <= (n-a*i)/b; j++) {
				int k = n - a*i - b*j;
				if (k%c==0) {
					res = Math.max(res, i+j+k/c);
				}
			}
		}
		//Output
		System.out.println(res);
	}
}
