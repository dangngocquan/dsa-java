package leetcode;

public class Task0141Easy {
    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
    public class Solution {
        public boolean hasCycle(ListNode head) {
            ListNode o1 = head, o2 = head;
            while (o2 != null && o2.next != null) {
                o1 = o1.next;
                o2 = o2.next.next;
                if (o1 == o2) {
                    return true;
                }
            }
            return false;
        }

        class ListNode {
            int val;
            ListNode next;
            ListNode(int x) {
                val = x;
                next = null;
            }
      }
    }
}
