package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve 158A problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/158/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 9:43:20 AM Mar 17, 2022
 */
public class A158 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//n - the number of participants took part in the contest
		int n = scanner.nextInt();
		
		
		int k = scanner.nextInt();
		int[] arr = new int[n+1];
		for (int i = 1; i <= n; i++) {
			arr[i]= scanner.nextInt();
 		}
		scanner.close();
		//Solve
		
		//res - the number of participants will advance to the next round.
		int res = 0;
		
		//Get res
		if (arr[k]>0) {
			for (int i = k; i <= n; i++) {
				if (arr[i] == arr[k]) res = i; 
				else break;
			}
		}else {
			for (int i = k; i >= 0; i--) {
				if (arr[i] > 0) {
					res = i;
					break;
				}
			}
		}
		
		//Print out the result.
		System.out.println(res);
	}
}
