package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A96 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/96/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 3:36:51 PM -  Mar 17, 2022
 */
public class A96 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		scanner.close();
		
		char[] arr = s.toCharArray();
		
		//isDangerous - the answer
		String isDangerous = "NO";
		
		//count - the number of chacracter which equals to 'temp' character
		int count = 0;
		
		//temp - the temporary character
		char temp = arr[0];
		for (char i: arr) {
			if (i== temp) {
				count++;
			}else {
				count = 1;
				temp = i;
			}
			if (count >= 7) {
				isDangerous = "YES";
				break;
			}
		}
		
		System.out.println(isDangerous);
	}
}
