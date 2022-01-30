package CodeForce;

import java.util.Scanner;

public class exe_A116 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
			b[i] = scanner.nextInt();
		}
		scanner.close();
		//Solve
		int res = b[0];
		int temp = b[0];
		for (int i = 1; i < n -1; i++) {
			temp = temp - a[i] + b[i];
			if (temp > res) {
				res = temp;
			}
		}
		//Output
		System.out.println(res);
	}
}
