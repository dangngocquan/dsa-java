package CodeForce;

import java.util.Scanner;

public class A1296 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] res = new String[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int oddCount = 0;
			for (int j = 0; j < n; j++) {
				if (scanner.nextInt() %2 == 1) oddCount++;
			}
			if (1<= oddCount&& oddCount<n) {
				res[i] = "YES";
			}else if (oddCount == 0){
				res[i] = "NO";
			}else if (oddCount==n){
				if (n%2==1) {
					res[i] = "YES";
				}else {
					res[i] = "NO";
				}
			}
		}
		scanner.close();
		//Output
		for (String i: res) System.out.println(i);
	}
}
