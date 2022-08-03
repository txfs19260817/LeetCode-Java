package Q0110_BalancedBinaryTree;

import Common.TreeNode;

class Solution {
    public boolean isBalanced(TreeNode root) {
        return root == null || Math.abs(getHeight(root.left) - getHeight(root.right)) < 2 && isBalanced(root.left) && isBalanced(root.right);
    }

    private int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }
}