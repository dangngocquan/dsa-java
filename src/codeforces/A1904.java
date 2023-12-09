package codeforces;

import java.io.*;

public class A1904 {
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

        public String nextLine() throws IOException {
            StringBuilder sb = new StringBuilder();
            byte c;
            while ((c = read()) != '\n' && c != '\r' && c != -1) {
                sb.append((char) c);
            }
            // Consume the newline characters if present (for both Unix and Windows line endings)
            if (c == '\r') {
                // Check if the next character is '\n' (Windows line ending)
                byte nextChar = read();
                if (nextChar != '\n') {
                    // If it's not '\n', we need to push it back to the buffer
                    bufferPointer--;
                }
            }
            return sb.toString();
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
            long a = fastScanner.nextLong();
            long b = fastScanner.nextLong();
            long xK = fastScanner.nextLong();
            long yK = fastScanner.nextLong();
            long xQ = fastScanner.nextLong();
            long yQ = fastScanner.nextLong();
            fastOutput.println(solve(a, b, xK, yK, xQ, yQ));
        }
        fastOutput.close();
    }

    public static long solve(long a, long b, long xK, long yK, long xQ, long yQ) {
        long absX = Math.abs(xQ - xK);
        long absY = Math.abs(yQ - yK);
        if (absX == 0) {
            if (absY == a * 2 || absY == b * 2) return 2;
            return 0;
        }
        if (absY == 0){
            if (absX == 2 * a || absX == 2 * b) return 2;
            return 0;
        }
        if (absX == 2 * a && absY == 2 * b) return 1;
        if (absY == 2 * a && absX == 2 * b) return 1;
        if (absX == absY && absX == a + b) return a == b? 1 : 2;
        if (absX == Math.abs(a - b) && absY == Math.abs(a - b)) return 2;
        if (absX == Math.abs(a- b) && absY == a + b) return 2;
        if (absY == Math.abs(a- b) && absX == a + b) return 2;

        return 0;
    }
}
