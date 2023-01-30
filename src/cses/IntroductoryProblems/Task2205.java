package cses.IntroductoryProblems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 
 * @author Bris
 * @since 3:29:08 PM - Jan 20, 2023
 *
 */
public class Task2205 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Queue<String> q = new LinkedList<>();
		q.add("");
		StringBuilder str = new StringBuilder();
		int tempCount = 1;
		while(!q.isEmpty()) {
			for (int i = 0; i < tempCount; i++) {
				String s = q.poll();
				if (s.length() == n) {
					str.append(s + "\n");
					continue;
				}
				String s1 = s + "0";
				String s2 = s + "1";
				if (i%2 == 0) {
					q.add(s1);
					q.add(s2);
				}else {
					q.add(s2);
					q.add(s1);
				}
			}
			tempCount *= 2;
		}
		System.out.println(str);
		scanner.close();
	}
}
