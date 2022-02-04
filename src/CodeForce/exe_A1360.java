package CodeForce;

import java.util.Scanner;

public class exe_A1360 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		for (int i = 0; i < t; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int x = Math.max(a, b);
			int y = Math.min(a, b);
			if (x > 2*y) {
				res[i] = x*x;
			}else {
				res[i] = 4*y*y;
			}
		}
		scanner.close();
		//Output
		for (int i: res) {
			System.out.println(i);
		}
	}
}
