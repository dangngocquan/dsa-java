package leetcode;

import java.util.LinkedList;
import java.util.List;

public class Task0725Medium {
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
        public ListNode[] splitListToParts(ListNode head, int k) {
            ListNode currentNode = head;
            List<ListNode> list = new LinkedList<>();
            while (currentNode != null) {
                list.add(currentNode);
                currentNode = currentNode.next;
            }

            ListNode[] arrayNode = new ListNode[k];

            int sizeBase = list.size() / k;
            int count1 = list.size() % k;
            int indexArray = 0;
            int indexList = 0;
            while (count1-- > 0) {
                arrayNode[indexArray] = list.get(indexList);
                if (indexList > 0) {
                    list.get(indexList-1).next = null;
                }
                indexArray++;
                indexList += (sizeBase + 1);
                k--;
            }
            while (k-- > 0) {
                if (sizeBase == 0) {
                    arrayNode[indexArray] = null;
                    indexArray++;
                    continue;
                }
                arrayNode[indexArray] = list.get(indexList);
                if (indexList > 0) {
                    list.get(indexList-1).next = null;
                }
                indexArray++;
                indexList += sizeBase;
            }

            return arrayNode;
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
