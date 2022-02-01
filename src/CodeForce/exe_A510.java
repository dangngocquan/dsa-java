package CodeForce;

import java.util.Scanner;

public class exe_A510 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.close();;
		//Solve
		String[] res = new String[n];
		for (int i = 0; i < n; i++) {
			String x = "";
			if (i %4==0 || i %4 == 2) {
				for (int j = 0; j < m; j++) {
					x += "#";
				}
			}else if (i%4==1){
				for (int j = 0; j < m-1; j++) {
					x+= ".";
				}
				x += "#";
			}else {
				for (int j = 0; j < m-1; j++) {
					x+= ".";
				}
				x = "#"+x;
			}
			res[i] = x;
		}
		//Output
		for (String i: res) {
			System.out.println(i);
		}
	}
}
