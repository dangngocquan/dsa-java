package codePTIT;

import java.util.Scanner;
import java.util.Stack;

public class J08023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            long[] heights = new long[n];
            for (int i = 0; i < n; i++) {
                heights[i] = scanner.nextLong();
            }

            System.out.println(getMaxArea(heights));
        }
    }

    public static long getMaxArea(long[] heights) {
        long maxArea = 0;
        int length = heights.length;
        Stack<Integer> stackIndexes = new Stack<Integer>();
        for (int index = 0; index <= length; index++) {
            while (stackIndexes.size() > 0 &&
                    (index == length || heights[index] <= heights[stackIndexes.peek()])) {
                long height = heights[stackIndexes.pop()];
                int startIndex = stackIndexes.size() > 0? stackIndexes.peek() + 1 : 0;
                long width = index - startIndex;
                maxArea = Math.max(maxArea, width * height);
            }
            stackIndexes.push(index);
        }
        return maxArea;
    }

}
