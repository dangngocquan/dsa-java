package CodeForce;

import java.util.Scanner;

public class A155 {
	public static void main(String[] args) {
		//Input + solve
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int res = 0;
		int max = 0;
		int min = 0;
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			if (i == 0) {
				max = x;
				min = x;
			}else {
				if (x > max) {
					res++;
					max = x;
				}else if (x < min) {
					min = x;
					res++;
				}
			}
		}
		scanner.close();
		//Output
		System.out.println(res);
	}
}
