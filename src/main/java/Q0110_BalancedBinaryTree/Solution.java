package Q0110_BalancedBinaryTree;

import Common.TreeNode;

class Solution {
    public boolean isBalanced(TreeNode root) {
        return root == null || Math.abs(maxDepth(root.left) - maxDepth(root.right)) < 2 && isBalanced(root.left) && isBalanced(root.right);
    }

    public int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}