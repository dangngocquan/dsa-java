package leetcode;

public class Task0404Easy {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public int sumOfLeftLeaves(TreeNode root) {
            if (root == null) return 0;
            int sum = 0;
            if (root.left != null)
                sum += isLeavesNode(root.left)? root.left.val : sumOfLeftLeaves(root.left);
            sum += sumOfLeftLeaves(root.right);
            return sum;
        }

        public boolean isLeavesNode(TreeNode node) {
            return node.left == null && node.right == null;
        }
    }
}
