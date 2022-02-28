package CodeForce;

import java.util.Arrays;
import java.util.Scanner;

public class B489 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) a[i] = scanner.nextInt();
		int m = scanner.nextInt();
		int[] b = new int[m];
		for (int i = 0; i < m; i++) b[i] = scanner.nextInt();
		scanner.close();
		//Solve
		Arrays.sort(a);
		Arrays.sort(b);
		int res = 0;
		int indexA = 0;
		int indexB = 0;
		while (indexA < n && indexB < m) {
			if (Math.abs(a[indexA] - b[indexB]) <= 1) {
				indexA++;
				indexB++;
				res++;
			}else if (a[indexA] - b[indexB] > 1){
				indexB++;
			}else if (b[indexB] - a[indexA] > 1) {
				indexA++;
			}
		}
		//Output
		System.out.println(res);
	}
}
