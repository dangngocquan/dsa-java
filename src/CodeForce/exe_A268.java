package CodeForce;

import java.util.Scanner;

public class exe_A268 {
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
		int res = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j != i && a[i] == b[j]) res++;
			}
		}
		//Output
		System.out.println(res);
 	}
}
