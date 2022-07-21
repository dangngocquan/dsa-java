package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve 1A problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 9:39:38 AM Mar 17, 2022
 */
public class A1 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//n, m, a - Input datas
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int a = scanner.nextInt();
		scanner.close();
		
		//res - the needed number of flagstones.
		long res = 0;
		
		//Get res
		if (n%a!=0) {
			n=n/a+1;
		}else {
			n /= a;
		}
		if (m%a!=0) {
			m=m/a+1;
		}else {
			m /= a;
		}
		res= (long)n*m;
		
		//Print out the result.
		System.out.println(res);
	}
}
