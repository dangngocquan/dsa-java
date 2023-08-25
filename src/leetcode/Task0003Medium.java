package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Task0003Medium {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            Map<Character, Integer> map = new HashMap<Character, Integer>();
            char[] chars = s.toCharArray();
            int n = chars.length;
            int maxLength = 0;
            int tempLength = 0;
            int indexStart = 0;
            for (int i = 0; i < n; i++) {
                char c = chars[i];
                if (map.containsKey(c)) {
                    if (indexStart > map.get(c)) {
                        tempLength++;
                    } else {
                        indexStart = map.get(c) + 1 ;
                        tempLength = i - indexStart + 1;
                    }
                } else {
                    tempLength++;
                }
                if (tempLength > maxLength) maxLength = tempLength;
                map.put(c, i);
            }
            return maxLength;
        }
    }
}
