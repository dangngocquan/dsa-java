package cses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Part02_SortingAndSearching_Task003_FerrisWheel_1090 {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = br.readLine().split(" ");
		int n = Integer.parseInt(strs[0]);
		long x = Long.parseLong(strs[1]);
		strs = br.readLine().split(" ");
		ArrayList<Long> p = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			p.add(Long.parseLong(strs[i]));
		}
		Collections.sort(p);
		int index1 = 0;
		int index2 = n-1;
		int counter = 0;
		while (index1 <= index2) {
			counter++;
			if (p.get(index1) + p.get(index2) <= x) {
				index1++;
			}
			index2--;
		}
		System.out.println(counter);
	}
}
