package other.collections.palindrome;

public class LongestPalindromeSubstring {
    public String longestPalindrome(String s) {
        StringBuilder sb = new StringBuilder("|");
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i)).append("|");
        }

        int n = sb.length();
        int centerIndex = 0;
        int furthestIndex = 0;
        int[] furthestFromCenters = new int[n];
        // count furthest palindrome can create if start at current center index

        for (int index = 0; index < n; index++) {
            // Example:
            // - - - - mirrorIndex - - - - - - - centerIndex - - - - - - - index - - - - -
            int mirrorIndex = 2 * centerIndex - index;  // mirrorIndex + index = 2 * centerIndex



            // Example:
            // - - mirrorFurthestIndex - - - - - - mirrorIndex - - - - - - - centerIndex - - - - - - - index - - - - - - furthestIndex
            if (index < furthestIndex) {
                furthestFromCenters[index] =
                        Math.min(furthestFromCenters[mirrorIndex],
                                furthestIndex - index);
            }

            int leftIndex = index - furthestFromCenters[index] - 1;
            int rightIndex = index + furthestFromCenters[index] + 1;
            while (leftIndex >= 0
                    && rightIndex < n
                    && sb.charAt(leftIndex) == sb.charAt(rightIndex)) {
                furthestFromCenters[index]++;
                leftIndex--;
                rightIndex++;
            }

            if (index + furthestFromCenters[index] > furthestIndex) {
                furthestIndex = index + furthestFromCenters[index];
                centerIndex = index;
            }
        }

        int maxLength = 0;
        int centerIndexOfLongestPalindrome = 0;
        for (int index = 0; index < n; index++) {
            if (furthestFromCenters[index] > maxLength) {
                maxLength = furthestFromCenters[index];
                centerIndexOfLongestPalindrome = index;
            }
        }

        int startIndexInStringSb = centerIndexOfLongestPalindrome - maxLength;
        int startIndexInStringS = startIndexInStringSb / 2;
        // Example:
        // s:     a   b   c   d   e
        // idx:   0   1   2   3   4
        // sb:  | a | b | c | d | e |
        // idx  0 1 2 3 4 5 6 7 8 9 10
        // => index(b) in s = (index(b) in sb - 1) / 2

        return s.substring(startIndexInStringS, startIndexInStringS + maxLength);
    }
}
