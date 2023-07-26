package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class C1846 {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                if (st.hasMoreTokens()) {
                    str = st.nextToken("\n");
                } else {
                    str = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader fastReader = new FastReader();
        int t = fastReader.nextInt();
        while (t-- > 0) {
            int n = fastReader.nextInt();
            int m = fastReader.nextInt();
            int h = fastReader.nextInt();
            int[][] matrix = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = fastReader.nextInt();
                }
            }
            System.out.println(solve(matrix, n, m, h));
        }
    }

    public static int solve(int[][] matrix, int n, int m, int h) {
        long mainPoints = 0;
        long mainPenalty = 0;
        int result = 1;
        for (int i = 0; i < n; i++) {
            Arrays.sort(matrix[i]);
            long sumTimes = 0;
            if (i == 0) {
                for (int j = 0; j < m; j++) {
                    sumTimes += matrix[i][j];
                    if (sumTimes > h) break;
                    mainPoints++;
                    mainPenalty += sumTimes;
                }
            } else {
                long points = 0;
                long penalty = 0;
                for (int j = 0; j < m; j++) {
                    sumTimes += matrix[i][j];
                    if (sumTimes > h) break;
                    points++;
                    penalty += sumTimes;
                }
                if (points > mainPoints) {
                    result++;
                } else if (points == mainPoints && penalty < mainPenalty) {
                    result++;
                }
            }
        }
        return result;
    }
}
