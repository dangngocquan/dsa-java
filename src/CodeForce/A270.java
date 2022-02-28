package CodeForce;

import java.util.Scanner;

public class A270 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] res = new String[t];
		for (int i = 0; i < t; i++) {
			int a = scanner.nextInt();
			//180*(n-2)/n = a <=> 180n -360 = a.n <=> n.(180-a) = 360 
			res[i] = "NO";
			if (360 % (180-a) == 0) res[i] = "YES";
		}
		scanner.close();
		//Output
		for (String i: res) {
			System.out.println(i);
		}
	}
}
