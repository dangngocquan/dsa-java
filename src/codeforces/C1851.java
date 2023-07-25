package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C1851 {
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
            int k = fastReader.nextInt();
            int[] c = new int[n];
            for (int i = 0; i < n; i++) c[i] = fastReader.nextInt();
            int colorFirst = c[0];
            int colorEnd = c[n-1];
            int count1 = 0;
            int count2 = 0;
            for (int color : c) {
                if (count1 < k) {
                    if (color == colorFirst) count1++;
                } else {
                    if (color == colorEnd) count2++;
                }
            }

            if (colorFirst == colorEnd && count1 >= k) {
                System.out.println("YES");
            } else if (count1 >= k && count2 >= k) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
