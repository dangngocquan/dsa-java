package codeForce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A381 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) list.add(scanner.nextInt());
		scanner.close();
		//Solve
		int pointOfSereja = 0;
		int pointOfDima = 0;
		while (list.size()>=2) {
			int size = list.size();
			if (list.get(0) >= list.get(size-1)) {
				pointOfSereja += list.get(0);
				list.remove(0);
				size -= 1;
			}else if (list.get(0) <= list.get(size-1)) {
				pointOfSereja += list.get(size -1);
				list.remove(size-1);
				size -= 1;
			}
			if (list.get(0) >= list.get(size-1)) {
				pointOfDima += list.get(0);
				list.remove(0);
				size -= 1;
			}else if (list.get(0) <= list.get(size-1)) {
				pointOfDima += list.get(size -1);
				list.remove(size-1);
				size -= 1;
			}
		}
		if (list.size() > 0) pointOfSereja += list.get(0);
		//Output
		System.out.println(pointOfSereja+" " + pointOfDima);
	}
}
