package com.c0ying.algorithm.s_114;

import com.c0ying.algorithm.TreeNode;

public class Solution {

    public static void flatten(TreeNode root) {
        helper(root);
    }

    public static TreeNode helper(TreeNode root){
        if (root == null) return null;
        TreeNode leftNode = helper(root.left);
        TreeNode rightNode = helper(root.right);
        if (leftNode != null) {
            TreeNode tmp = leftNode;
            while (tmp.right != null){
                tmp = tmp.right;
            }
            tmp.right =rightNode;
            root.left = null;
            root.right = leftNode;
        }else{
            root.right = rightNode;
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(5);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(6);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.right = e;
        flatten(root);
    }
}
