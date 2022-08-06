package Q0543_DiameterofBinaryTree;

import Common.TreeNode;

class Solution {
    private int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        longestPath(root);
        return diameter;
    }

    private int longestPath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = longestPath(root.left), r = longestPath(root.right);
        diameter = Math.max(diameter, l + r); // left height + self + right height
        return Math.max(l, r) + 1; // self max height
    }
}