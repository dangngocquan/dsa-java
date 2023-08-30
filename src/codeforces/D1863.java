package codeforces;

import java.io.*;

public class D1863 {
    static class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int bufferPointer = 0;
        private int bytesRead = 0;

        public FastScanner(InputStream inputStream) {
            this.in = inputStream;
        }

        private void fillBuffer() throws IOException {
            bytesRead = in.read(buffer, bufferPointer = 0, buffer.length);
            if (bytesRead == -1) buffer[0] = -1;
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead) fillBuffer();
            return buffer[bufferPointer++];
        }

        public int nextInt() throws IOException {
            int number = 0;
            byte c;
            // Skip non-digit characters
            do {
                c = read();
            } while (c <= ' ');
            // Read the number
            boolean isNegative = false;
            if (c == '-') {
                isNegative = true;
                c = read();
            }
            while (c >= '0' && c <= '9') {
                number = number * 10 + (c - '0');
                c = read();
            }
            return isNegative ? -number : number;
        }

        public long nextLong() throws IOException {
            long num = 0;
            byte c = read();
            boolean negative = false;
            while (c <= ' ') {
                c = read();
            }
            if (c == '-') {
                negative = true;
                c = read();
            }
            while (c >= '0' && c <= '9') {
                num = num * 10 + (c - '0');
                c = read();
            }
            return negative ? -num : num;
        }

        public String next() throws IOException {
            StringBuilder sb = new StringBuilder();
            byte c;
            // Skip leading whitespace characters
            do {
                c = read();
            } while (c <= ' ');
            // Read the string
            while (c > ' ') {
                sb.append((char) c);
                c = read();
            }
            return sb.toString();
        }

        public double nextDouble() throws IOException {
            int integerPart = nextInt();
            if (read() != '.') {
                return integerPart;
            }
            int fractionalPart = 0;
            int decimalDivisor = 1;

            while (true) {
                byte c = read();
                if (c < '0' || c > '9') {
                    break;
                }
                fractionalPart = fractionalPart * 10 + (c - '0');
                decimalDivisor *= 10;
            }
            return integerPart + (double) fractionalPart / decimalDivisor;
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
        FastScanner fastScanner = new FastScanner(System.in);
        FastOutput fastOutput = new FastOutput(System.out);
        int t = fastScanner.nextInt();
        while (t-- > 0) {
            int n = fastScanner.nextInt();
            int m = fastScanner.nextInt();
            char[][] board = new char[n+2][m+2];
            char[][] ans = new char[n+2][m+2];

            for (int i = 1 ; i <= n; i++) {
                char[] chars = fastScanner.next().toCharArray();
                for (int j = 1; j <= m; j++) {
                    board[i][j] = chars[j-1];
                    if (chars[j-1] == '.') ans[i][j] = '.';
                }
            }

            char[] colors = new char[] {'W', 'B'};
            int colorIndex = 0;
            boolean flag = true;
            for (int i = 1; i <= n; i++) {
                int count = 0;
                for (int j = 1; j <= m; j++) {
                    char cBoard = board[i][j];
                    char cAns = ans[i][j];
                    if (cAns == '.') continue;
                    if (cBoard == 'U') {
                        count++;
                        ans[i][j] = colors[colorIndex];
                        colorIndex = 1-colorIndex;
                        ans[i+1][j] = colors[colorIndex];
                    }
                }
                if (count % 2 != 0) {
                    flag = false;
                    break;
                }
            }

            if (!flag) {
                fastOutput.println(-1);
                continue;
            }

            for (int j = 1; j <= m; j++) {
                int count = 0;
                for (int i = 1; i <= n; i++) {
                    char cBoard = board[i][j];
                    char cAns = ans[i][j];
                    if (cAns == '.') continue;
                    if (cBoard == 'L') {
                        count++;
                        ans[i][j] = colors[colorIndex];
                        colorIndex = 1-colorIndex;
                        ans[i][j+1] = colors[colorIndex];
                    }
                }
                if (count % 2 != 0) {
                    flag = false;
                    break;
                }
            }

            if (!flag) {
                fastOutput.println(-1);
                continue;
            }

            for (int i = 1 ; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    fastOutput.print(ans[i][j]);
                }
                fastOutput.println("");
            }

        }
        fastOutput.close();
    }
}
