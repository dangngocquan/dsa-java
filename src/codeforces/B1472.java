package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve B1472 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1472/B"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 2:23:02 PM -  Mar 18, 2022
 */
public class B1472 {
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
		String[] res = new String[t];
		for (int i =0; i < t; i++) {
			int n = scanner.nextInt();
			int count1 = 0;
//			int count2 = 0;
			for (int j = 0; j < n; j++) {
				int x = scanner.nextInt();
				if (x == 1) {
					count1++;
				}else {
//					count2++;
				}
			}
			//Solve
			res[i] = "YES";
			if (count1==0) {
				if (n%2==1) {
					res[i] = "NO";
				}
			}else {
				if (count1 %2 ==1) {
					res[i] = "NO";
				}
			}
		}
		scanner.close();
		//Output
		for (String i : res) {
			System.out.println(i);
		}
	}
}
