package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A1335 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1335/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 10:33:31 PM -  Mar 17, 2022
 */
public class A1335 {
	/**
	 * 
	 * This method is used to get the number of ways to distribute exactly n candies 
	 * between two sisters in a way described in the problem statement.
	 * 
	 * @param n is the number of candies you have.
	 * @return Return a integer data type - the number of ways to distribute exactly n 
	 * candies between two sisters in a way described in the problem statement.
	 */
	public static int getResult(int n) {
		int res = 0;
		if (n%2 == 1) {
			res = n - (n+1)/2;
		}else {
			res = n - (n+2)/2;
		}
		return res;
	}
	
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Input + Solve
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		for (int  i = 0; i < t ; i++) {
			res[i] = getResult(scanner.nextInt());
		}
		scanner.close();
		//Output
		for (int i : res) {
			System.out.println(i);
		}
		
	}
}
