package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve B266 in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/266/B"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 4:29:05 PM -  Mar 17, 2022
 */
public class B266 {
	/**
	 * 
	 * This method is used to get the character array after changed one time.
	 * 
	 * @param arr The character array which you want to get change.
	 * @return Return a character array after changed one time.
	 */
	public static char[] getchange(char[] arr) {
		char[] res = new char[arr.length];
		for (int i= 0; i < res.length; i++) {
			if (i == res.length - 1) {
				res[i] = arr[i];
				continue;
			}
			if (arr[i] == 'B' && arr[i+1] == 'G' ) {
				res[i] = 'G';
				res[i+1] = 'B';
				i +=1;
			}else {
				res[i] = arr[i];
			}
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
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int t = scanner.nextInt();
		String s = scanner.next();
		scanner.close();
		
		char[] arr = s.toCharArray();
		for (int i = 1; i <= t; i++) {
			arr = getchange(arr);
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]);
		}
	}
}
