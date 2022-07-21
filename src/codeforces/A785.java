package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A785 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/785/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 10:31:45 PM -  Mar 17, 2022
 */
public class A785 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Input + solve
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int res = 0;
		for (int i = 0; i < n; i++) {
			String x = scanner.next();
			switch (x) {
			case "Tetrahedron":
				res += 4;
				break;
			case "Cube":
				res += 6;
				break;
			case "Octahedron":
				res += 8;
				break;
			case "Dodecahedron":
				res += 12;
				break;
			case "Icosahedron":
				res += 20;
				break;
			default : 
				res += 0;
				break;
			}
		}
		scanner.close();
		//Output
		System.out.println(res);
	}
}
