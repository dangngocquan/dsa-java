package codeforces;

import java.util.Scanner;

/**
 * 
 * <a href = "https://codeforces.com/problemset/problem/1385/C"> Link </a>
 * 
 * @author Bris
 * @version 1.0
 * @since 10:40:03 PM -  Mar 23, 2022
 */
public class C1385 {
	/**
	 * 
	 * The main method.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
			}
			int[] status = new int[n];
			if (n <= 2) {
				System.out.println(0);
			}else {
				int ans = n-2;
				status[n-1] = -1;
				for (int i = n-2; i >= 0; i--) {
					if (a[i] > a[i+1]) {
						status[i] = -1;
					}else if (a[i] < a[i+1]){
						status[i] = 1;
					}else {
						status[i] = 0;
					}
				}
				boolean isStart = false;
				for (int i = n-1; i >= 0; i--) {
					if (status[i] == 1) {
						isStart = true;
						ans = i;
					}
					if (isStart && status[i] == 0) {
						ans = i;
					}
					if (isStart && status[i] == -1) {
						break;
					}
				}
				if (!isStart) {
					System.out.println(0);
				}else {
					System.out.println(ans);
				}
			}
		}
		scanner.close();
	}
}
