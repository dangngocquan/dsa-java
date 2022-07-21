package codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B368 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] a = new int[n+1];
		for (int i = 1; i <= n; i++) a[i] = scanner.nextInt();
		int[] l = new int[m];
		for (int i = 0; i < m ; i++) l[i] = scanner.nextInt();
		scanner.close();
		//Solve
		int[] res = new int[n+1];
		Set<Integer> set = new HashSet<Integer>();
		for (int i = n; i >=1; i--) {
			set.add(a[i]);
			res[i] = set.size();
		}
		//Output
		for (int i: l) System.out.println(res[i]);
	}
}
