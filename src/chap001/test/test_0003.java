package chap001.test;

public class test_0003 {
	static void  change(int[] n) {
		n[1] = 0;
	}
	public static void main(String[] args) {
		int[] n = {1,2,3};
		change(n);
		System.out.println(n[1]);
	}
}
