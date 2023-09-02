package leetcode;

import java.util.*;

public class Task2707Medium {
     class Solution {
        public static Set<String> setDictionary;
        public static String str;
        public static int length;
        public static Integer[] numberCharacterRemove;
        public int minExtraChar(String s, String[] dictionary) {
            setDictionary = new HashSet<>(Arrays.asList(dictionary));
            str = s;
            length = s.length();
            numberCharacterRemove = new Integer[length];

            return getMinCharacterRemove(0);
        }

        public int getMinCharacterRemove(int startIndex) {
            if (startIndex == length) return 0;

            if (numberCharacterRemove[startIndex] != null) return numberCharacterRemove[startIndex];

            int count = getMinCharacterRemove(startIndex + 1) + 1;
            for (int endIndex = startIndex+1; endIndex <= length; endIndex++) {
                String word = str.substring(startIndex, endIndex);
                if (setDictionary.contains(word)) {
                    count = Math.min(count, getMinCharacterRemove(endIndex));
                }
            }

            numberCharacterRemove[startIndex] = count;
            return count;
        }
    }
}
