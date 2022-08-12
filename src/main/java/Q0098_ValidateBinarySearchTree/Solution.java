package Q0098_ValidateBinarySearchTree;

import Common.TreeNode;

import java.util.Stack;

class Solution {
    public boolean isValidBST(TreeNode root) {
        TreeNode prev = null;
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.empty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (prev != null && prev.val >= root.val) {
                return false;
            }
            prev = root;
            root = root.right;
        }
        return true;
    }
}