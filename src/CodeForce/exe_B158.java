package CodeForce;

import java.util.Scanner;

public class exe_B158 {
	static int getCountOfValue(int value, int[] arr) {
		int count = 0;
		for (int i : arr) {
			if (i== value) count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] s = new int[n];
		for (int i = 0; i < n; i++) {
			s[i] = scanner.nextInt();
		}
		scanner.close();
		//Solve
		int number1 = getCountOfValue(1, s);
		int number2 = getCountOfValue(2, s);
		int number3 = getCountOfValue(3, s);
		int number4 = getCountOfValue(4, s);
		int res = number4;
		if (number3 >= number1) {
			res += number3 + (number2+1)/2;
		}else {
			res += number3;
			number1 -= number3;
			if (number2%2==0) {
				res += number2/2 + (number1+3)/4;
			}else {
				res += number2/2 + (2+number1+3)/4;
			}
		}
		//Output
		System.out.println(res);
	}
}
