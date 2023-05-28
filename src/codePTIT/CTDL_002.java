package codePTIT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class CTDL_002 {
	public static int[] A;
	public static int counter;
	public static Stack<Integer> stack;
	public static int k, n, sum;
	
	public static void solve(int index) {
		if (sum == k) {
			counter++;
			printStack();
		}else if (sum < k && index < n) {
			for (int i = index; i < n; i++) {
				sum += A[i];
				stack.add(A[i]);
				solve(i+1);
				stack.pop();
				sum -= A[i];
			}
		}
	}
	
	public static void printStack() {
		String str = "";
		for (int i = 0; i < stack.size(); i++) {
			str += stack.elementAt(i) + " ";
		}
		System.out.println(str.trim());
	}
	
	public static void main(String[] args) throws IOException {
		 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 	String[] strs = br.readLine().split(" ");
		 	n = Integer.parseInt(strs[0]);
		 	k = Integer.parseInt(strs[1]);
		 	strs = br.readLine().split(" ");
		 	A = new int[n];
		 	for (int i = 0; i < n; i++) {
		 		A[i] = Integer.parseInt(strs[i]);
		 	}
		 	
		 	counter = 0;
		 	sum = 0;
		 	stack = new Stack<>();
		 	solve(0);
		 	System.out.println(counter);
	}
}
