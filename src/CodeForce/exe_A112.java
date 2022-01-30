package CodeForce;

import java.util.Arrays;
import java.util.Scanner;

public class exe_A112 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		String[] str = new String[2];
		str[0] = scanner.next().toLowerCase();
		String a = str[0];
		str[1] = scanner.next().toLowerCase();
		scanner.close();
		//Solve
		int res = 0;
		Arrays.sort(str);
		if (str[0].equals(str[1])) {
			res = 0;
		}else {
			if (a.equals(str[0])) {
				res = -1;
			}else {
				res = 1;
			}
		}
		//Output
		System.out.println(res);
	}
}
