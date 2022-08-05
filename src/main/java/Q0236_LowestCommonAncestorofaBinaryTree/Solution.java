package Q0236_LowestCommonAncestorofaBinaryTree;

import Common.TreeNode;

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode l = lowestCommonAncestor(root.left, p, q), r = lowestCommonAncestor(root.right, p, q);
        if (l == null) {
            return r;
        }
        if (r == null) {
            return l;
        }
        return root;
    }
}