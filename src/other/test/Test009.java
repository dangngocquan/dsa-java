package other.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test009 {
	static void display(List<Integer> list,int turn, int left, int mid, int right) {
		System.out.printf("Turn %-2d:   ",turn);
		for (int i = 0; i < left; i++) System.out.print("       ");
		for (int i = left; i <= right; i++) System.out.printf("%-7d",list.get(i));
		for (int i = right+1; i < list.size(); i++) System.out.print("       ");
		System.out.println();
		System.out.print("           ");
		for (int i = 0; i < list.size(); i++) {
			if (i == mid) {
				System.out.print("*      ");
				continue;
			}
			System.out.print("       ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Binary Search...");
		System.out.println("Write 'end' when you finished.");
		System.out.print("Write your binary array :\t");
		List<Integer> list = new ArrayList<Integer>();
		boolean isEnd = false;
		while (!isEnd) {
			String x = scanner.next();
			if (x.equals("end")) {
				isEnd = true;
			}else {
				list.add(Integer.valueOf(x));
			}
		}
		System.out.print("What is element you want to get index?	");
		int valueSearching = scanner.nextInt();
		scanner.close();
		//Solve
		System.out.println("======================================================================================");
		int ans = -1;
		int turn = 0;
		System.out.printf("Turn %-2d:   ",turn);
		for (int i: list) System.out.printf("%-7d",i);
		System.out.println();
		System.out.println();
		int left = 0;
		int right = list.size() - 1;
		while (left <= right) {
			int mid = (left + right)/2;
			turn++;
			display(list, turn, left, mid, right);
			if (list.get(mid) == valueSearching) {
				ans = mid;
				break;
			}
			if (valueSearching > list.get(mid)) {
				left = mid + 1;
			}else if (valueSearching < list.get(mid)) {
				right = mid - 1;
			}
		}
		//Output
		System.out.println("Index of your element : " + ans);
	}
}
