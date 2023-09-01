package codePTIT;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class J02033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = scanner.nextLong();
        System.out.println(maxSum(n, k, a));
    }

    public static long maxSum(int n, int k, long[] a) {
        List<Long> positives = new LinkedList<>();
        List<Long> negatives = new LinkedList<>();
        long sumPositive = 0;
        long sumNegative = 0;
        for (long value : a) {
            if (value < 0) {
                negatives.add(value);
                sumNegative += value;
            } else {
                positives.add(value);
                sumPositive += value;
            }
        }
        Collections.sort(negatives);

        while (negatives.size() > 0 && k > 0) {
            long value = negatives.remove(0);
            sumNegative -= value;
            positives.add(-value);
            sumPositive -= value;
            k--;
        }

        if (k % 2 == 0) {
            return sumNegative + sumPositive;
        } else {
            Collections.sort(positives);
            if (positives.size() > 0) sumPositive -= 2* positives.get(0);
            return sumNegative + sumPositive;
        }
    }
}
