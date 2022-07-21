package codeforces;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * This class is used to solve A112 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/112/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 3:01:58 PM Mar 17, 2022
 */
public class A112 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] str = new String[2];
		str[0] = scanner.next().toLowerCase();
		String a = str[0];
		str[1] = scanner.next().toLowerCase();
		scanner.close();
	
		//res - the result.
		int res = 0;
		
		Arrays.sort(str);
		if (str[0].equals(str[1])) {
			res = 0;
		}else {
			if (a.equals(str[0])) {
				res = -1;
			}else {
				res = 1;
			}
		}
		
		System.out.println(res);
	}
}
