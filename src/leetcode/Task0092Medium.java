package leetcode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Task0092Medium {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode reverseBetween(ListNode head, int left, int right) {
            ListNode currentNode = head;
            List<ListNode> list = new LinkedList<>();
            while (currentNode != null) {
                list.add(new ListNode(currentNode.val));
                currentNode = currentNode.next;
            }
            left--;
            right--;
            while (left < right) {
                ListNode node = list.get(left);
                list.set(left,list.get(right));
                list.set(right, node);
                left++;
                right--;
            }
            for (int i = 0; i < list.size()-1; i++) {
                list.get(i).next = list.get(i+1);
            }

            return list.get(0);
        }
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
