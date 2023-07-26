package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D1846 {
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
            long d = fastReader.nextLong();
            long h = fastReader.nextLong();
            long tempY = 0;
            double area = 0.0;
            for (int i = 0; i < n; i++) {
                long y = fastReader.nextInt();
                if (i == 0) {
                    area += d * h / 2.0;
                } else {
                    area += d * h / 2.0;
                    if (y - tempY <= h) {
                        double h1 = h- (y-tempY);
                        double d1 = h1 / h * d;
                        area -= d1 * h1 / 2.0;
                    }
                }
                tempY = y;
            }
            System.out.println(area);
        }
    }
}
