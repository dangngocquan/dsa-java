package CodeForce;

import java.util.Scanner;

public class A1352 {
	static String[] getResult(int n) {
		String[] res = new String[2];
		int count = 0;
		String s = "";
		for (int i = 10000; i >= 1; i /= 10) {
			if ((n/i)%10 != 0) {
				count++;
				s += ((n/i)%10)*i + " ";
			}
		}
		res[0] = count +"";
		res[1] = s;
		return res;
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] res1 = new String[t];
		String[] res2 = new String[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			res1[i] = getResult(n)[0];
			res2[i] = getResult(n)[1];
		}
		scanner.close();
		//Output
		for (int i = 0; i < t; i++) {
			System.out.println(res1[i]);
			System.out.println(res2[i]);
		}
	}
}
