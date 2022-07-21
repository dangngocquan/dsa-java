package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class C1360 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] ans = new String[t];
		for (int i = 0; i < t ; i++) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			int evenCount = 0;
			int oddCount = 0;
			for (int j = 0; j < n; j++) {
				a[j] = scanner.nextInt();
				if (a[j] %2==0) {
					evenCount++;
				}else {
					oddCount++;
				}
			}
			ans[i] = "";
			if (evenCount%2==0 && oddCount%2==0) {
				ans[i] = "YES";
			}else {
				Arrays.sort(a);
				ans[i] = "NO";
				for (int j = 1; j < n; j++) {
					if (a[j] == a[j-1] + 1) {
						ans[i] = "YES";
						break;
					}
				}
			}
		}
		scanner.close();
		//Output
		for (String i : ans) System.out.println(i);
	}
}
