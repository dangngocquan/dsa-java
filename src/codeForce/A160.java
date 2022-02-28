package codeForce;

import java.util.Arrays;
import java.util.Scanner;

public class A160 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		int sum = 0;
		for (int i = 0; i<n; i++) {
			a[i] = scanner.nextInt();
			sum += a[i];
		}
		scanner.close();
		//Solve;
		int res = 0;
		int sum1 = 0;
		Arrays.sort(a);
		for (int i = n-1; i >=0; i--) {
			sum1 += a[i];
			res++;
			if (sum1 > sum/2) break;
		}
		//Output
		System.out.println(res);
	}
}
