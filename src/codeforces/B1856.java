package codeforces;

import java.io.*;
import java.util.*;

public class B1856 {
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


    static class FastOutput {
        private BufferedWriter writer;

        public FastOutput(OutputStream outputStream) {
            this.writer = new BufferedWriter(new OutputStreamWriter(outputStream));
        }

        public void print(Object obj) throws IOException {
            writer.write(obj.toString());
        }

        public void println(Object obj) throws IOException {
            writer.write(obj.toString());
            writer.newLine();
        }

        public void close() throws IOException {
            writer.close();
        }
    }

    public static void main(String[] args) throws IOException {
        FastReader fastReader = new FastReader();
        FastOutput fastOutput = new FastOutput(System.out);

        int t = fastReader.nextInt();
        while (t-- > 0) {
            int n = fastReader.nextInt();
            long count1 = 0;
            long sum = 0;
            for (int i = 0; i < n; i++) {
                long value = fastReader.nextLong();
                if (value == 1) {
                    count1++;
                } else {
                    sum += value;
                }
            }
            if (count1 > 0) {
                fastOutput.println((sum >= n)? "YES" : "NO");
            } else {
                fastOutput.println((n==1)? "NO" : "YES");
            }

        }


        fastOutput.close();
    }
}
