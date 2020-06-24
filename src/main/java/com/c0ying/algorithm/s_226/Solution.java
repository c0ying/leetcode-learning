package com.c0ying.algorithm.s_226;

import com.c0ying.algorithm.TreeNode;

public class Solution {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    public static void main(String[] args) {

    }
}
