package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class B1846 {
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
            char[][] matrix = new char[3][3];
            for (int i = 0; i < 3; i++) {
                matrix[i] = fastReader.next().toCharArray();
            }
            System.out.println(solve(matrix));
        }
    }

    public static String solve(char[][] m) {
        for (int i = 0; i < 3; i++) {
            if (m[0][i] == m[1][i] && m[1][i] == m[2][i] && m[0][i] != '.') {
                return m[0][i] + "";
            }
            if (m[i][0] == m[i][1] && m[i][1] == m[i][2] && m[i][0] != '.') {
                return m[i][0] + "";
            }
        }

        if (m[0][0] == m[1][1] && m[1][1] == m[2][2] && m[0][0] != '.') {
            return m[0][0] + "";
        }

        if (m[0][2] == m[1][1] && m[1][1] == m[2][0]  && m[0][2] != '.') {
            return m[0][2] + "";
        }

        return "DRAW";
    }
}
