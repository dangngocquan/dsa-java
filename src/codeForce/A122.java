package codeForce;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 * 
 * This class is used to solve A122 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/122/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 5:01:59 PM -  Mar 17, 2022
 */
public class A122 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		//Solve
		//res - the answer
		String res = "NO";
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(4);
		q.add(7);
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(7);
		for (int i = 1; i <= Math.log(n); i++) {
			int count = q.size();
			for (int j = 1; j <= count; j++) {
				int x = q.poll();
				q.add(x*10+4);
				q.add(x*10+7);
				list.add(x*10+4);
				list.add(x*10+7);
			}	
		}
		for (int i : list) {
			if (n % i == 0) {
				res = "YES";
				break;
			}
		}
		//Output
		System.out.println(res);
	}
}
