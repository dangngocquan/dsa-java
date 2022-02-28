package CodeForce;

import java.util.Scanner;

public class A1374 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		for (int i = 0; i < t; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			int n = scanner.nextInt();
			res[i] = (n/x)*x+y;
			if (res[i] > n) res[i] -= x;
		}
		scanner.close();
		//Output
		for (int i: res) {
			System.out.println(i);
		}
	}
}
