package CodeForce;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class A469 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Set<Integer> set = new LinkedHashSet<Integer>();
		int n1 = scanner.nextInt();
		for (int i = 1; i <= n1; i++) {
			set.add(scanner.nextInt());
		}
		int n2 = scanner.nextInt();
		for (int i = 1; i <= n2; i++) {
			set.add(scanner.nextInt());
		}
		scanner.close();
		//Solve
		String res = "Oh, my keyboard!";
		if (n == set.size()) res = "I become the guy.";
		//Output
		System.out.println(res);
		
	}
}
