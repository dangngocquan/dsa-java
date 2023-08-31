package codeforces;

import java.io.*;

public class B1861 {
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
            String a = fastScanner.next();
            String b = fastScanner.next();
            int n = a.length();

            boolean ans = false;
            for (int i = 0; i < n-1; i++) {
                if (a.charAt(i) == '0' && b.charAt(i) == '0' &&
                    a.charAt(i+1) == '1' && b.charAt(i+1) == '1') {
                    ans = true;
                    break;
                }
            }

            fastOutput.println(ans? "YES" : "NO");
        }
        fastOutput.close();
    }
}
