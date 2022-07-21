package codeforces;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 * This class is used to solve A236 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/236/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 3:20:17 PM Mar 17, 2022
 */
public class A236 {
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
		
		//set - the set that store distinct characters of string s
		Set<Character> set =new LinkedHashSet<Character>();
		
		//res - the answer
		String res = "";
		
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		if (set.size() %2 == 1) {
			res = "IGNORE HIM!";
		}else {
			res = "CHAT WITH HER!";
		}
		
		System.out.println(res);
	}
}
