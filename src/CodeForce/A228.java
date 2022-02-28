package CodeForce;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class A228 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		Set<Integer> set = new LinkedHashSet<>();
		for (int i = 1; i <= 4; i++) {
			set.add(scanner.nextInt());
		}
		scanner.close();
		//Output
		System.out.println(4-set.size());
	}
}
