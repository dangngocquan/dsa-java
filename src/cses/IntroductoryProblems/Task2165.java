package cses.IntroductoryProblems;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Bris
 * @since 5:23:49 PM - Jan 20, 2023
 *
 */
public class Task2165 {
	public static StringBuilder s;
	public static List<Integer> l1 = new LinkedList<>();
	public static List<Integer> l2 = new LinkedList<>();
	
	public static void moveFromTo(int from, int to, int otherStack, int numDisk) {
		if (numDisk == 1) {
			s.append(from);
			s.append(" ");
			s.append(to);
			s.append("\n");
		}else {
			moveFromTo(from, otherStack, to, numDisk-1);
			moveFromTo(from, to, otherStack, 1);
			moveFromTo(otherStack, to, from, numDisk-1);
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberDisks = scanner.nextInt();
		s = new StringBuilder();
		s.append((int)(Math.pow(2, numberDisks) - 1) + "\n");
		moveFromTo(1, 3, 2, numberDisks);
		System.out.println(s);
		scanner.close();
	}
}
