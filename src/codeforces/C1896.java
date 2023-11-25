package codeforces;

import java.io.*;
import java.util.*;

public class C1896 {
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
            int x = fastScanner.nextInt();
            Map<Pair, Integer> a = new TreeMap<>();
            Map<Pair, Integer> b = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                long value = fastScanner.nextLong();
                a.put(new Pair(value, i), i);
            }
            for (int i = 0; i < n; i++) {
                long value = fastScanner.nextLong();
                b.put(new Pair(value, i), i);
            }

            int count = 0;
            Iterator<Pair> iteratorA = a.keySet().iterator();
            Iterator<Pair> iteratorB = b.keySet().iterator();
            Queue<Pair> qA = new LinkedList<>();
            Queue<Pair> qB = new LinkedList<>();
            while (iteratorA.hasNext() && iteratorB.hasNext()) {
                Pair a1 = iteratorA.next();
                Pair b1 = iteratorB.next();
                qA.add(a1);
                qB.add(b1);
            }

            int k = n - x;
            while (k-- > 0) qA.add(qA.poll());
            iteratorA = qA.iterator();
            iteratorB = qB.iterator();
            k = qA.size();
            while (k-- > 0) {
                if (iteratorA.next().value > iteratorB.next().value) count++;
            }
            if (count != x) {
                fastOutput.println("NO");
            } else {
                fastOutput.println("YES");
                long[] bb = new long[n];
                while (!qA.isEmpty()) {
                    bb[qA.poll().index] = qB.poll().value;
                }
                for (Long e : bb) fastOutput.print(e + " ");
                fastOutput.println("");
            }
        }
        fastOutput.close();
    }

    static class Pair implements Comparable<Pair> {
        public Long value;
        public Integer index;

        public Pair(Long value, Integer index) {
            this.value = value;
            this.index = index;
        }

        @Override
        public int compareTo(Pair o) {
            if ((long) value == o.value) {
                return Integer.compare(index, o.index);
            }
            return Long.compare(value, o.value);
        }
    }
}
