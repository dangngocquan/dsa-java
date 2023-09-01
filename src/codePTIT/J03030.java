package codePTIT;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class J03030 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(solve(s));
    }

    public static int solve(String s) {
        if (s.length() == 0) return 0;
        int[] lastIndexA = new int[s.length()]; // lastIndexA[i] is last index of 'A' in s[0,i] (include index i)
        int[] lastIndexB = new int[s.length()]; // lastIndexB[i] is last index of 'B' in s[0,i] (include index i)
        if (s.charAt(0) == 'A') {
            lastIndexA[0] = 0;
            lastIndexB[0] = -1;
        } else {
            lastIndexA[0] = -1;
            lastIndexB[0] = 0;
        }
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                lastIndexA[i] = i;
                lastIndexB[i] = lastIndexB[i-1];
            } else {
                lastIndexA[i] = lastIndexA[i-1];
                lastIndexB[i] = i;
            }
        }
        List<int[]> lastIndexAB = new LinkedList<>();
        lastIndexAB.add(lastIndexA);
        lastIndexAB.add(lastIndexB);

        int toggleAB = 0; // toggleAB = 0 is character 'A', toggle = 1 is character 'B'
        int lastIndex; // last index of character {$toggleAB} in current string s
        int ans = 0;
        StringBuilder sb = new StringBuilder(s);
        do {
            lastIndex = lastIndexAB.get(1-toggleAB)[sb.length()-1];
            if (lastIndex == -1) break;

            // Remove all last characters which same as {$toggleAB}
            sb.delete(lastIndex+1, sb.length());

            // Now, current string s has last character is {1-$toggleAB}
            // Find last index of character {$toggleAB} in current string s
            int index = lastIndexAB.get(toggleAB)[sb.length()-1];
            if (index == -1) {
                ans++;
                break;
            } else {
                if (index < sb.length()-2) {
                    toggleAB = 1 - toggleAB;
                }
                ans++;
                sb.delete(index+1, sb.length());
            }
//            System.out.println(s);
        } while (lastIndex > -1);
        return ans;

    }

}
