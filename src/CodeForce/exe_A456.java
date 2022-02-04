package CodeForce;

import java.util.Scanner;

public class exe_A456 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[100001];
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			a[x] = scanner.nextInt();
		}
		scanner.close();
		//Solve
		String res = "Poor Alex";
		for (int i = 1; i < n; i++) {
			if (a[i] > a[i+1]) {
				res = "Happy Alex";
				break;
			}
		}
		//Output
		System.out.println(res);
	}
}
