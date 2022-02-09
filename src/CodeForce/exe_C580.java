package CodeForce;

import java.util.ArrayList;
import java.util.Scanner;

public class exe_C580 {
	static int n,m,ans,consecutiveCount;
	static boolean[] isCat;
	static ArrayList<Integer>[] node;
	static int parent;
	
	static void dfs(int k) {
		if (k == parent) return;
		if (node[k].size()==1 && k != 1) {
			if (isCat[k]) {
				consecutiveCount++;
			}else {
				consecutiveCount = 0;
			}
			if (consecutiveCount <= m) {
				ans++;
			}
			return;
		}
		if (isCat[k]) {
			consecutiveCount++;
			if (consecutiveCount > m) return;
		}else {
			consecutiveCount = 0;
		}
		int tempParent = parent;
		parent = k;
		for (int x : node[k]) {
			int temp = consecutiveCount;
			dfs(x);
			consecutiveCount = temp;
		}
		
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();
		isCat = new boolean[n+1];
		node = new ArrayList[n+1];
		for (int i = 1; i <= n; i++) {
			if (scanner.nextInt() == 1) {
				isCat[i] = true;
			}else {
				isCat[i] = false;
			}
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
		parent = 0;
		dfs(1);
		//Output
		System.out.println(ans);
	}
}
