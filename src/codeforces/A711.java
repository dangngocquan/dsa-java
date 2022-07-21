package codeforces;

import java.util.Scanner;

public class A711 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] row = new String[n];
		for (int i = 0; i < n; i++) row[i] = scanner.next();
		scanner.close();
		//Solve
		String ans = "NO";
		for (int i = 0; i < n; i++) {
			if (row[i].substring(0,2).equals("OO")) {
				ans = "YES";
				row[i] = "++" + row[i].substring(2);
				break;
			}else if (row[i].substring(3).equals("OO")) {
				ans = "YES";
				row[i] = row[i].substring(0,3) + "++";
				break;
			}
		}
		//Output
		if (ans.equals("NO")) {
			System.out.println(ans);
		}else {
			System.out.println(ans);
			for (String i : row) System.out.println(i);
		}
	}
}
