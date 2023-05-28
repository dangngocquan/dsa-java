package cses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Part02_SortingAndSearching_Task004_ConcertTickets_1091 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strs = br.readLine().split(" ");
        int n = Integer.parseInt(strs[0]);
        int m = Integer.parseInt(strs[1]);

        strs = br.readLine().split(" ");
        int[] h = new int[n];
        for (int index = 0; index < n; index++) {
            h[index] = Integer.parseInt(strs[index]);
        }

        strs = br.readLine().split(" ");
        int[] t = new int[m];
        for (int index = 0; index < m; index++) {
            t[index] = Integer.parseInt(strs[index]);
        }


    }

    public static void printResult(int n, int m, int[] h, int[] t) {
        Arrays.sort(h);
        Arrays.sort(t);
        return;
    }
}