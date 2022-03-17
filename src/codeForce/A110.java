package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A110 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/110/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 4:42:13 PM -  Mar 17, 2022
 */
public class A110 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		scanner.close();
		
		//res - the answer
		String res = "YES";
		
		//count - the number of characters which equal to '4' or '7'
		int count = 0;
		while (n>0) {
			if (n%10 == 4 || n %10 == 7) {
				count ++;
			}
			n /= 10;
		}
		if (count !=4 && count != 7) res = "NO";
		//Output
		System.out.println(res);
	}
}
