package codeForce;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class A443 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		scanner.close();
		//Solve
		Set<Character> set = new LinkedHashSet<Character>();
		if (s.length()>2) {
			for (int i = 1; i < s.length(); i+=3) {
				set.add(s.charAt(i));
			}
		}
		//Output
		System.out.println(set.size());
	}
}
