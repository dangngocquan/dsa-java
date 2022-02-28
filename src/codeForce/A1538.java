package codeForce;

import java.util.Scanner;

public class A1538 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int[] a = new int[n+1];
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			int indexMin = 0;
			int indexMax = 0;
			for (int j = 1; j <= n; j++) {
				a[j] = scanner.nextInt();
				if (min > a[j]) {
					min = a[j];
					indexMin = j;
				}
				if (max < a[j]) {
					max = a[j];
					indexMax = j;
				}
			}
			int index1 = Math.min(indexMin, indexMax);
			int index2 = Math.max(indexMax, indexMin);
			res[i] = Math.min(index2,n+1-index1);
			res[i] = Math.min(res[i], index1 + n+1 - index2);
		}
		scanner.close();
		//Output
		for (int i : res) System.out.println(i);
	}
}
