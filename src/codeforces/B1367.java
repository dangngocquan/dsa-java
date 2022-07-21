package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve B1367 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1367/B"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 1:28:04 PM -  Mar 18, 2022
 */
public class B1367 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t]; 
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int evenCount = 0;
			int oddCount = 0;
			int errorCount = 0;
			for (int j = 0; j < n; j++) {
				int x = scanner.nextInt();
				if (x%2==0) {
					evenCount++;
					if (j%2==1) errorCount++;
				}else {
					oddCount++;
					if (j%2==0) errorCount++;
				}
			}
			if (evenCount==oddCount) {
				res[i] = errorCount/2;
			}else if (evenCount-oddCount == 1) {
				res[i] = errorCount/2;
			}else {
				res[i] = -1;
			}
		}
		scanner.close();
		//Output
		for (int i: res) {
			System.out.println(i);
		}
	}
}
