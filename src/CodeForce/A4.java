package CodeForce;

import java.util.Scanner;

public class A4 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int w = scanner.nextInt();
		scanner.close();
		//Solve
		String res = "NO";
		if (w %2==0 && w/2 >=2) res = "YES";
		//Output
		System.out.println(res);
	}
}
