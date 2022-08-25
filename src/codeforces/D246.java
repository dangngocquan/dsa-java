package codeforces;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * <a href = "https://codeforces.com/problemset/problem/246/D"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:39:08 AM -  Jul 17, 2022
 */
public class D246 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		Set<Integer>[] countColorsNearColor = new Set[100001];
		List<Node> nodeList = new ArrayList<>();
		
		nodeList.add(new Node(0, 0));
		for (int i = 1; i <= n; i++) {
			int color = scanner.nextInt();
			nodeList.add(new Node(i, color));
			countColorsNearColor[color] = new LinkedHashSet<>();
		}
		
		for (int i = 1; i <= m; i++) {
			int id1 = scanner.nextInt();
			int id2 = scanner.nextInt();
			int color1 = nodeList.get(id1).getColor();
			int color2 = nodeList.get(id2).getColor();
			
			if (color1 != color2) {
				countColorsNearColor[color1].add(color2);
				countColorsNearColor[color2].add(color1);
			}
		}
		scanner.close();
		
		int maxColor = 0;
		for (Set<Integer> set : countColorsNearColor) {
			if (set != null) {
				maxColor = Math.max(maxColor, set.size());
			}
			
		}
		
		for (int i = 1; i < 100001; i++) {
			if (countColorsNearColor[i] != null && countColorsNearColor[i].size() == maxColor) {
				System.out.println(i);
				break;
			}
		}
	}
}

class Node {
	private int id;
	private int color;
	
	public Node(int id, int color) {
		this.id = id;
		this.color = color;
	}
	
	public int getId() {
		return this.id;
	}
	
	public int getColor() {
		return this.color;
	}
}
