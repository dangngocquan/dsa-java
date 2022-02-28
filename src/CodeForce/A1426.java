package CodeForce;

import java.util.Scanner;

public class A1426 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int x = scanner.nextInt();
			res[i] = 1;
			if (n >=3) {
				res[i] = (int)(Math.ceil((n-2)*1.0/x) + 1);
			}
		}
		scanner.close();
		//Output
		for (int i : res) System.out.println(i);
	}
}
