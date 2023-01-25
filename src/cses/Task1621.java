package cses;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 * @author Bris
 * @since 11:23:07 PM - Jan 25, 2023
 *
 */
public class Task1621 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		String[] a = scanner.nextLine().split(" ");
		Set<String> set = new HashSet<>();
		for (String s : a) {
			set.add(s);
		}
		System.out.println(set.size());
		scanner.close();
	}
}
