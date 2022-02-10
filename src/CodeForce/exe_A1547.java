package CodeForce;

import java.util.Scanner;

public class exe_A1547 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] ans = new int[t];
		for (int i = 0; i < t; i++) {
			scanner.nextLine();
			int xA = scanner.nextInt();
			int yA = scanner.nextInt();
			int xB = scanner.nextInt();
			int yB = scanner.nextInt();
			int xF = scanner.nextInt();
			int yF = scanner.nextInt();
			ans[i] = Math.abs(xA-xB) + Math.abs(yA-yB);
			if ((xA==xF && xF==xB && (yA-yF)*(yF-yB) >0) || (yA==yF && yF==yB && (xA-xF)*(xF-xB) >0)) ans[i] += 2;
		}
		scanner.close();
		//Output
		for (int i : ans) System.out.println(i);
	}
}
