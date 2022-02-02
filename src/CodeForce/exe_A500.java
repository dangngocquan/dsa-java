package CodeForce;

import java.util.Scanner;

public class exe_A500 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int t = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 1; i <= n-1; i++) a[i] = scanner.nextInt();
		scanner.close();
		//Solve
		String res = "NO";
		int location = 1;
		while (location < n) {
			location += a[location];
			if (location == t) {
				res = "YES";
				break;
			}
		}
		//Output
		System.out.println(res);
	}
}
