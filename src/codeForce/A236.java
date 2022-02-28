package codeForce;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class A236 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		scanner.close();
		//Solve
		Set<Character> set =new LinkedHashSet<Character>();
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		if (set.size() %2 == 1) {
			res = "IGNORE HIM!";
		}else {
			res = "CHAT WITH HER!";
		}
		//Output
		System.out.println(res);
	}
}
