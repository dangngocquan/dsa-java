package CodeForce;

import java.util.Scanner;

public class exe_B1472 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] res = new String[t];
		for (int i =0; i < t; i++) {
			int n = scanner.nextInt();
			int count1 = 0;
//			int count2 = 0;
			for (int j = 0; j < n; j++) {
				int x = scanner.nextInt();
				if (x == 1) {
					count1++;
				}else {
//					count2++;
				}
			}
			//Solve
			res[i] = "YES";
			if (count1==0) {
				if (n%2==1) {
					res[i] = "NO";
				}
			}else {
				if (count1 %2 ==1) {
					res[i] = "NO";
				}
			}
		}
		scanner.close();
		//Output
		for (String i : res) {
			System.out.println(i);
		}
	}
}
