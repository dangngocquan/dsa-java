package codeforces;

import java.io.*;
import java.util.*;

public class E1931 {
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
            int n = fastScanner.nextInt();
            long m = fastScanner.nextLong() + 1;
            Number[] numbers = new Number[n];
            for (int i = 0; i < n; i++) numbers[i] = new Number(fastScanner.nextLong());
            fastOutput.println(solve(numbers, m));
        }
        fastOutput.close();
    }

    public static String solve(Number[] numbers, long m) {
        Arrays.sort(numbers);
        TreeMap<Integer, List<Number>> map = new TreeMap<>();
        long m0 = 0;
        for (Number number : numbers) {
            if (number.last0 == 0) {
                m0 += number.length;
            } else {
                if (!map.containsKey(number.last0)) map.put(number.last0, new LinkedList<>());
                map.get(number.last0).add(number);
            }
        }
        if (m0 >= m) return "Sasha";
        while (map.size() > 0) {
            int lastKey = map.lastKey();
            Number lastValue = map.get(lastKey).removeLast();
            m0 += lastValue.length;
            if (m0 >= m) return "Sasha";
            if (map.get(lastKey).size() == 0) map.remove(lastKey);
            if (map.size() == 0) break;
            int lastKey1 = map.lastKey();
            Number lastValue1 = map.get(lastKey1).removeLast();
            m0 += lastValue1.length + lastKey1;
            if (m0 >= m) return "Sasha";
            if (map.get(lastKey1).size() == 0) map.remove(lastKey1);
        }
        return "Anna";
    }

    static class Number implements Comparable<Number> {
        public int last0;
        public int length;

        public Number(long n) {
            while (n %10 == 0) {
                n /= 10;
                this.last0++;
            }
            this.length = (n + "").length();
        }

        @Override
        public int compareTo(Number number) {
            int compare = Long.compare(last0, number.last0);
            if (compare == 0) {
                return Long.compare(length, number.length);
            }
            return compare;
        }
    }
}
