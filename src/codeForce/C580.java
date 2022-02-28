package codeForce;

import java.util.ArrayList;
import java.util.Scanner;

public class C580 {
	static boolean[] isCat;
	static boolean[] isUsed;
	static ArrayList<Integer>[] node;
	static int ans = 0;
	
	static void dfs(int k, int m, int consecutiveCount) {
		isUsed[k] = true;
		if (node[k].size()==1) {
			if (isCat[k]) {
				if (consecutiveCount + 1 <=m) ans++;
			}else {
				ans++;
			}
			return;
		}
		for (int x : node[k]) {
			if (!isUsed[x]) {
				if (isCat[k]) {
					if (consecutiveCount+1 > m) return;
					dfs(x,m,consecutiveCount+1);
				}else {
					dfs(x,m,0);
				}
			}
		}
		isUsed[k] = false;
		return;
	}
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		isCat = new boolean[n+1];
		isUsed = new boolean[n+1];
		node = new ArrayList[n+1];
		for (int i = 1; i <= n; i++) {
			if (scanner.nextInt() == 1) {
				isCat[i] = true;
			}else {
				isCat[i] = false;
			}
			isUsed[i] = false;
			node[i] = new ArrayList<Integer>();
		}
		for (int i = 1; i <= n-1; i++) {
			int x1 = scanner.nextInt();
			int x2 = scanner.nextInt();
			node[x1].add(x2);
			node[x2].add(x1);
		}
		scanner.close();
		//Solve
		isUsed[1] = true;
		for (int x : node[1]) {
			if (isCat[1]) {
				dfs(x,m,1);
			}else {
				dfs(x,m,0);
			}
			
		}
		//Output
		System.out.println(ans);
		
	}
}
