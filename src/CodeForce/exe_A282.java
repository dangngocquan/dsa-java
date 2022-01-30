package CodeForce;

import java.util.Scanner;

public class exe_A282 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int res = 0;
		for (int i = 1; i <=n; i++) {
			String str = scanner.next();
			if (str.charAt(1) == '+') {
				res +=1;
			}else {
				res -=1;
			}
		}
		scanner.close();
		//Output
		System.out.println(res);
	}
}
