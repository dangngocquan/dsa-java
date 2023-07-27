package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class B1849 {
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
            List<Pair> l = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                int value = fastReader.nextInt() % k;
                if (value == 0) value = k;
                l.add(new Pair(i+1, value));
            }
            Collections.sort(l);
            for (Pair p : l) System.out.print(p.index + " ");
            System.out.println();
        }
    }

    static class Pair implements Comparable {
        public int index;
        public int value;

        public Pair(int a, int b) {
            this.index = a;
            this.value = b;
        }

        @Override
        public int compareTo(Object o) {
            if (this.value > ((Pair) o).value) return -1;
            if (this.value == ((Pair) o).value) {
                return this.index - ((Pair) o).index;
            }
            return 1;
        }
    }
}
