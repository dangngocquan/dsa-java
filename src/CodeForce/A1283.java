package CodeForce;

import java.util.Scanner;

public class A1283 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		for (int i = 0; i < t; i++) {
			int h = scanner.nextInt();
			int m = scanner.nextInt();
			res[i] = 1440 - 60*h - m;
		}
		scanner.close();
		//Output
		for (int i : res) System.out.println(i);
	}
}
