package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A1352 problem in codeforce.
 * The lik of this problem is <a href = "https://codeforces.com/problemset/problem/1352/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 12:44:36 PM -  Mar 18, 2022
 */
public class A1352 {
	/**
	 * 
	 * This method is used to get the result of test case.
	 * 
	 * @param n is a integer data type.
	 * @return Return the result of test case.
	 */
	public static String[] getResult(int n) {
		String[] res = new String[2];
		int count = 0;
		String s = "";
		for (int i = 10000; i >= 1; i /= 10) {
			if ((n/i)%10 != 0) {
				count++;
				s += ((n/i)%10)*i + " ";
			}
		}
		res[0] = count +"";
		res[1] = s;
		return res;
	}
	
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
		String[] res1 = new String[t];
		String[] res2 = new String[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			res1[i] = getResult(n)[0];
			res2[i] = getResult(n)[1];
		}
		scanner.close();
		//Output
		for (int i = 0; i < t; i++) {
			System.out.println(res1[i]);
			System.out.println(res2[i]);
		}
	}
}
