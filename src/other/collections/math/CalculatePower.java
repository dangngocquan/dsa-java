package other.collections.math;

public class CalculatePower {
    public static long power(long a, long b) {
        if (b == 0) return 1;
        if (a == 0) return 0;
        long temp;
        temp = power(a, b / 2);
        if (b % 2 == 0)
            return temp * temp % 1000000007;
        else
            return (a * temp) % 1000000007 * temp % 1000000007;
    }
}
