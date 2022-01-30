package CodeForce;

import java.util.Scanner;

public class exe_A705 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		//Solve
		String res = "";
		for (int i = 1; i <=n; i++) {
			if (i==1) {
				res += "I hate";
			}else {
				if (i%2==1) {
					res += " that I hate";
				}else {
					res += " that I love";
				}
			}
		}
		res += " it";
		//Output
		System.out.println(res);
	}
}
