package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A133 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/133/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 5:27:29 PM -  Mar 17, 2022
 */
public class A133 {
	/**
	 * 
	 * This method is used to check a character c if it is HQ9 or not.
	 * 
	 * @param c is the character which you want to check.
	 * @return Return true if c is a HQ9 character. Otherwise, return false.
	 */
	public static boolean isHQ9(char c) {
		boolean check = false;
		if (c == 'H' || c == 'Q'|| c == '9') {
			check = true;
		}
		return check;
	}
	
	/**
	 * 
	 * This method is used to check the characters of the char array 'arr', from index 'start' to index 'end', if them satisfy the condition of the problem.
	 * 
	 * @param arr is a character array.
	 * @param start is the starting index.
	 * @param end is the ending index
	 * @param count is the number of '+' from index 'start' to index 'end'
	 * @return Return true if all character from index 'start' to 'end' are satisfy the condition of the problem. Otherwise, return false.
	 */
	public static boolean check(char[] arr, int start, int end, int count) {
		boolean res = false;
		for (int i = start; i <= end; i++) {
			if ((char)(arr[i]+count) =='9'|| arr[i] == '+') continue;
			if (isHQ9((char)(arr[i]+count))) {
				res = true;
				break;
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
		//Input
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		scanner.close();
		//Solve
		String res = "NO";
		char[] a = s.toCharArray();
		
		//count - a temporary number, store the number of character '+'
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (isHQ9(a[i])) {
				res = "YES";
				break;
			}else if (a[i] == '+') {
				count++;
				if (check(a, 0, i,count)) {
					res = "YES";
					break;
				}
			}
		}
		//Output
		System.out.println(res);
	}
}
