package CodeForce;

import java.util.Scanner;

public class exe_A734 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String s = scanner.next();
		scanner.close();
		//Solve
		String res = "Friendship";
		int countA = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'A') countA++;
		}
		if (countA > n - countA) {
			res = "Anton";
		}else if (countA < n - countA) {
			res = "Danik";
		}
		//Output
		System.out.println(res);
	}
}
