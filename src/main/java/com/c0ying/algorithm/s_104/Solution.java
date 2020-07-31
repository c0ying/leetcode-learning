package com.c0ying.algorithm.s_104;

import com.c0ying.algorithm.TreeNode;

public class Solution {

    public static int maxDepth(TreeNode root) {
        return root == null? 0: Math.max(maxDepth(root.left), maxDepth(root.right)) +1;
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
        System.out.println(maxDepth(root));
    }
}
