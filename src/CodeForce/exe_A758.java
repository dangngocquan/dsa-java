package CodeForce;

import java.util.Arrays;
import java.util.Scanner;

public class exe_A758 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		scanner.close();
		//Solve
		Arrays.sort(a);
		int res = 0;
		for (int i : a) {
			res += a[n-1] - i;
		}
		//Output
		System.out.println(res);
	}
}
