package codeForce;

import java.util.Scanner;

public class B1324 {
	static boolean isNearEachOther(int[] a, int value) {
		int firstIndex = -1;
		int secondIndex = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == value) {
				if (firstIndex == -1) {
					firstIndex = i;
				}else {
					secondIndex = i;
					break;
				}
			}
		}
		if (Math.abs(firstIndex - secondIndex) == 1) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			int[] count = new int[n+1];
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
				count[a[i]]++;
			}
			String ans = "NO";
			for (int i = 1; i <= n; i++) {
				if (count[i] >= 3) {
					ans = "YES";
					break;
				}else if (count[i] == 2 && !isNearEachOther(a,i)) {
					ans = "YES";
					break;
				}
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
