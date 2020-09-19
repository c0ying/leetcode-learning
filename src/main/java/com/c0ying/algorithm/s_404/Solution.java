package com.c0ying.algorithm.s_404;

import com.c0ying.algorithm.TreeNode;

public class Solution {

    public int sumOfLeftLeaves(TreeNode root) {
        return dfs(root, root);
    }

    public int dfs(TreeNode root, TreeNode parent){
        int sum = 0;
        if (root.left == null && root.right == null && root == parent.left) {
            sum += root.val;
            return sum;
        }
        if (root.left != null) sum += dfs(root.left, root);
        if (root.right != null) sum += dfs(root.right, root);
        return sum;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode a = new TreeNode(9);
        TreeNode b = new TreeNode(20);
        TreeNode c = new TreeNode(15);
        TreeNode d = new TreeNode(7);
        root.left = a;
        root.right = b;
        b.left = c;
        b.right = d;
        Solution solution = new Solution();
        System.out.println(solution.sumOfLeftLeaves(root));
    }
}
