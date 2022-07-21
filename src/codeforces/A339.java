package codeforces;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * This class is used to solve A339 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/339/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 3:09:44 PM Mar 17, 2022
 */
public class A339 {
	/**
	 * 
	 * The main method - etry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		scanner.close();
		
		//res - the result string
		String res = "";
		
		//n - the number of character which is in range [0-9]
		int n = str.length()/2 + 1;
		
		//arr - the char array, to store all character which is in range [0-9] of str
		char[] arr = new char[n];
		
		//index - the temporary index
		int index = 0;
		for (int i = 0; i < str.length(); i+=2) {
			arr[index] = str.charAt(i);
			index++;
		}
		Arrays.sort(arr);
		
		//Create the result string
		for (int i = 0; i < n ; i++) {
			res += "+" + arr[i];
		}
		
		System.out.println(res.substring(1));
	}
}
