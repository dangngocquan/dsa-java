package codeforces;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * <a href = "https://codeforces.com/contest/1673/problem/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 10:14:51 PM -  Apr 30, 2022
 */
public class B1673 {
	
	
	public static boolean isPerfectBalanceString(String s, int length) {
		 Set<Character> set = new LinkedHashSet<>();
		 for (int i = 0; i < length; i++) {
			 set.add(s.charAt(i));
		 }
		 for (int i = 0; i <= length - set.size(); i++) {
			 Set<Character> tempSet = new LinkedHashSet<>();
			 for (int j = i; j < i + set.size(); j++) {
				 tempSet.add(s.charAt(j));
			 }
			 if (set.size() != tempSet.size()) {
				 return false;
			 }
		 }
		 return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			String s = scanner.next();
			System.out.println((isPerfectBalanceString(s, s.length())? "YES" : "NO"));
		}
		scanner.close();
	}
}
