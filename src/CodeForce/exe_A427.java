package CodeForce;

import java.util.Scanner;

public class exe_A427 {
	public static void main(String[] args) {
		//Input + solve
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int res = 0;
		int policeCount = 0;
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			if (x==-1) {
				if (policeCount==0) {
					res++;
				}else {
					policeCount--;
				}
			}else {
				policeCount+=x;
			}
		}
		scanner.close();
		//Output
		System.out.println(res);
	}
}
