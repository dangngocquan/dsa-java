package CodeForce;

import java.util.Scanner;

public class B1367 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t]; 
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int evenCount = 0;
			int oddCount = 0;
			int errorCount = 0;
			for (int j = 0; j < n; j++) {
				int x = scanner.nextInt();
				if (x%2==0) {
					evenCount++;
					if (j%2==1) errorCount++;
				}else {
					oddCount++;
					if (j%2==0) errorCount++;
				}
			}
			if (evenCount==oddCount) {
				res[i] = errorCount/2;
			}else if (evenCount-oddCount == 1) {
				res[i] = errorCount/2;
			}else {
				res[i] = -1;
			}
		}
		scanner.close();
		//Output
		for (int i: res) {
			System.out.println(i);
		}
	}
}
