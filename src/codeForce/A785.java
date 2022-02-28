package codeForce;

import java.util.Scanner;

public class A785 {
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
