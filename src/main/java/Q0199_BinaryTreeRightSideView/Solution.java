package Q0199_BinaryTreeRightSideView;

import Common.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        List<TreeNode> q = new ArrayList<>();
        if (root != null) q.add(root);
        while (!q.isEmpty()) {
            int last = 0;
            List<TreeNode> p = new ArrayList<>();
            for (TreeNode node : q) {
                last = node.val;
                if (node.left != null) {
                    p.add(node.left);
                }
                if (node.right != null) {
                    p.add(node.right);
                }
            }
            ans.add(last);
            q = p;
        }
        return ans;
    }
}