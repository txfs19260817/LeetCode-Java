package Q0102_BinaryTreeLevelOrderTraversal;

import Common.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<TreeNode> q = new ArrayList<>();
        if (root != null) q.add(root);
        while (!q.isEmpty()) {
            List<Integer> row = new ArrayList<>();
            List<TreeNode> p = new ArrayList<>();
            for (TreeNode node : q) {
                row.add(node.val);
                if (node.left != null) {
                    p.add(node.left);
                }
                if (node.right != null) {
                    p.add(node.right);
                }
            }
            ans.add(row);
            q = p;
        }
        return ans;
    }
}