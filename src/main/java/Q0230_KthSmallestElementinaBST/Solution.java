package Q0230_KthSmallestElementinaBST;

import Common.TreeNode;

import java.util.Stack;

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int ans = 0, idx = 1;
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.empty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (idx == k) {
                ans = root.val;
                break;
            }
            idx++;
            root = root.right;
        }
        return ans;
    }
}