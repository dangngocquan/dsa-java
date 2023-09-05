package leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Task0138Medium {
    /*
    // Definition for a Node.
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    */
    public class Solution {
        public Node copyRandomList(Node head) {
            if (head == null) return null;

            HashMap<Node, Node> map = new HashMap<>();

            Node head0 = head;
            while (head0 != null) {
                map.put(head0, new Node(head0.val));
                head0 = head0.next;
            }

            head0 = head;
            while (head0 != null) {
                map.get(head0).next = map.get(head0.next);
                map.get(head0).random = map.get(head0.random);
                head0 = head0.next;
            }

            return map.get(head);
        }

        class Node {
            int val;
            Node next;
            Node random;

            public Node(int val) {
                this.val = val;
                this.next = null;
                this.random = null;
            }
        }
    }
}
