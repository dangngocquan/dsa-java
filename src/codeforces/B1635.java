package codeforces;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class B1635 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] n = new int[t];
		List<int[]> list = new LinkedList<int[]>();
		for (int i = 0; i < t; i++) {
			n[i] = scanner.nextInt();
			int[] a = new int[n[i]];
			for (int j = 0; j < n[i]; j++) a[j] = scanner.nextInt();
			list.add(a);
		}
		scanner.close();
		//Output
		for (int i = 0; i < t; i++) {
			int ans = 0;
			int[] a = list.get(i);
			for (int j = 1; j < n[i]-1; j++) {
				if(a[j] > a[j-1] && a[j] > a[j+1]) {
					if (j+1 == n[i]-1) {
						a[j+1] = a[j];
					}else {
						a[j+1] = Math.max(a[j], a[j+2]);
					}
					ans++;
				}
			}
			System.out.println(ans);
			for (int j : a) System.out.print(j+ " ");
			System.out.println();
		}
	}
}
