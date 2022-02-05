package CodeForce;

import java.util.Scanner;

public class exe_A327 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count1 = 0;
		int count0 = 0;
		int count0max = -1;
		for (int i = 1; i <= n; i++) {
			if (scanner.nextInt()==1) {
				count1++;
				if (count0 > 0) count0--;
			}else {
				count0++;
				if (count0 > count0max) count0max = count0;
			}
		}
		scanner.close();
		//Output
		System.out.println(count1 + count0max);
	}
}
