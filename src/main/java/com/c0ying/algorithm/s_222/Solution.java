package com.c0ying.algorithm.s_222;

import com.c0ying.algorithm.TreeNode;

public class Solution {

    public static int countNodes(TreeNode root) {
        int count = 0;
        if (root != null) {
            count++;
            count+=countNodes(root.left);
            count+=countNodes(root.right);
        }
        return count;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(3);
        TreeNode c = new TreeNode(4);
        TreeNode d = new TreeNode(5);
        TreeNode e = new TreeNode(6);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;

        System.out.println(countNodes(root));
    }
}
