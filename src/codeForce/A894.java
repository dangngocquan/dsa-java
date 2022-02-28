package codeForce;

import java.util.Scanner;

public class A894 {
	static long ans = 0;
	static void dfs(String s,int k, int indexStart) {
		if (k==3) {
			for (int i = indexStart; i < s.length(); i++) {
				if (s.charAt(i) == 'Q') ans++;
			}
		}else if (k==2) {
			for (int i = indexStart; i < s.length(); i++) {
				if (s.charAt(i) == 'A') dfs(s,3,i+1) ; 
			}
		}else if (k==1) {
			for (int i = indexStart; i < s.length(); i++) {
				if (s.charAt(i) == 'Q') dfs(s,2,i+1) ; 
			}
		}
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		scanner.close();
		//Solve
		dfs(s,1,0);
		//Output
		System.out.println(ans);
	}
}
