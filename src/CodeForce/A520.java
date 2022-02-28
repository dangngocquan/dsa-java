package CodeForce;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class A520 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String s = scanner.next();
		scanner.close();
		//Solve
		s = s.toLowerCase();
		Set<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < n; i++) {
			set.add(s.charAt(i));
		}
		String res = "NO";
		if (set.size() == 26) res = "YES";
		//Output
		System.out.println(res);
	}
}
