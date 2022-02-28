package codeForce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A490 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list3 = new ArrayList<Integer>();
		for (int i = 1 ; i <= n; i++) {
			int x = scanner.nextInt();
			if (x==1) {
				list1.add(i);
			}else if (x==2) {
				list2.add(i);
			}else {
				list3.add(i);
			}
		}
		scanner.close();
		//Output
		int min = Math.min(Math.min(list1.size(), list2.size()),list3.size());
		System.out.println(min);
		for (int i = 0; i < min; i++) {
			System.out.println(list1.get(i) + " " + list2.get(i) + " " + list3.get(i));
		}
	}
}
