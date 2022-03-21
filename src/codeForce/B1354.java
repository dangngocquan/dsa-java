package codeForce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * This program is used to solve B1354 in codeforce.
 * The link of this program is <a href = "https://codeforces.com/problemset/problem/1354/B"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 1:15:48 PM -  Mar 21, 2022
 */
public class B1354 {
	
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			String s = scanner.next();
			List<Character> listKey = new ArrayList<Character>();
			List<Integer> listValue = new ArrayList<Integer>();
			//Example: if you have a string "12222133333332":
			//We will have:
			//listKey   = [1, 2, 1, 3, 2]
			//listValue = [1, 4, 1, 7, 1]
			
			//Create listKey and listValue
			char tempKey = s.charAt(0);
			int tempValue = 1;
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if (ch == tempKey) {
					tempValue++;
				}else {
					listKey.add(tempKey);
					listValue.add(tempValue);
					tempKey = ch;
					tempValue = 1;
				}
				if (i == s.length() - 1) {
					listKey.add(tempKey);
					listValue.add(tempValue);
				}
			}
			
			//Compute ans
			int ans = Integer.MAX_VALUE;
			if (listKey.size() < 3) {
				ans = 0;
			}else {
				for (int i = 1; i < listKey.size() - 1; i++) {
					if (listKey.get(i) == listKey.get(i-1)) {
						continue;
					}
					if (listKey.get(i) == listKey.get(i+1)) {
						continue;
					}
					if (listKey.get(i-1) == listKey.get(i+1)) {
						continue;
					}
					ans = Math.min(ans, listValue.get(i) + 2);
				}
				if (ans == Integer.MAX_VALUE) {
					ans = 0;
				}
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
